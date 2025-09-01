package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int COUNT_PLAYERS = 3;
    public static final int COUNT_ROUNDS = 3;

    private static Player[] players = new Player[COUNT_PLAYERS];
    private int currentPlayerIndex = 0;

    public GuessNumber(String[] names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void play(Scanner scanner) throws InterruptedException {
        Random random = new Random();
        castLots(random);
        System.out.printf("%nИгра началась! У каждого игрока по %d попыток%n", MAX_ATTEMPTS);
        Player currPlayer = players[0];
        for (int i = 1; i <= COUNT_ROUNDS; i++) {
            int secretNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            int playerNumber;
            boolean guessed = false;
            System.out.printf("РАУНД %d%n", i);
            while (!isRoundOverByAttempts()) {
                if (isOutOfAttemptsPlayer(currPlayer)) {
                    continue;
                }
                System.out.printf("Попытка %d%nЧисло вводит %s: ",
                        currPlayer.getAttemptCount() + 1, currPlayer.getName());
                playerNumber = enterNumber(currPlayer, scanner);
                printCheckNumberMessage(playerNumber, secretNumber);
                if (playerNumber == secretNumber) {
                    guessed = true;
                    currPlayer.addWin();
                }
                if (guessed && isSameNumberAttempts()) {
                    break;
                }
                currPlayer = players[changePlayerIndex()];
            }
            printGuessedNumbers();
            resetPlayers();
        }
        printWinners(findWinner());
    }

    private static void castLots(Random random) throws InterruptedException {
        for (int i = players.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[randomIndex];
            players[randomIndex] = temp;
        }
        animateCastLots();
    }

    private static void animateCastLots() throws InterruptedException {
        String message = "Бросаем жребий, чтобы определить, кто будет угадывать первым...";
        System.out.print(message);
        Thread.sleep(1500);
        cleanLine(message);
        printSpinner();
    }

    private static void cleanLine(String message) {
        System.out.print("\r");
        System.out.print(" ".repeat(message.length()));
        System.out.print("\r");
    }

    public static void printSpinner() throws InterruptedException {
        char[] spins = {'-', '\\', '|', '/'};
        for (int i = 0; i < spins.length * 3; i++) {
            System.out.print("\rЖребий: " + spins[i % 4]);
            Thread.sleep(250);
        }
        System.out.print("\rЖребий: ");
        for (Player player : players) {
            System.out.print(player.getName() + " ");
        }
    }

    private boolean isRoundOverByAttempts() {
        int sumAttemps = 0;
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            sumAttemps += players[i].getAttemptCount();
        }
        return (sumAttemps == COUNT_PLAYERS * MAX_ATTEMPTS);
    }

    private static boolean isOutOfAttemptsPlayer(Player currPlayer) {
        if (currPlayer.getAttemptCount() == MAX_ATTEMPTS) {
            System.out.printf("У %s закончились попытки!%n", currPlayer.getName());
            return true;
        }
        return false;
    }

    private static int enterNumber(Player currPlayer, Scanner scanner) {
        while (true) {
            try {
                int playerNumber = scanner.nextInt();
                scanner.nextLine();
                currPlayer.setNumbers(playerNumber);
                return playerNumber;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.nextLine();
            }
        }
    }

    private static void printCheckNumberMessage(int playerNumber, int secretNumber) {
        if (playerNumber == secretNumber) {
            System.out.print("Угадал!!!\n");
            return;
        }
        String checkMessage = (playerNumber > secretNumber) ? "больше" : "меньше";
        System.out.printf("%d %s загаданного числа%n", playerNumber, checkMessage);
    }

    private static boolean isSameNumberAttempts() {
        int sumAttemps = 0;
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            sumAttemps += players[i].getAttemptCount();
        }
        return (sumAttemps % COUNT_PLAYERS == 0);
    }

    private int changePlayerIndex() {
        return currentPlayerIndex = (currentPlayerIndex + 1) % COUNT_PLAYERS;
    }

    private static void printGuessedNumbers() {
        System.out.println("Раунд завершен!\nИгроки ввели следующие числа: ");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player);
        }
    }

    private static void resetPlayers() {
        for (Player player : players) {
            player.resetGuessedNumbers();
        }
    }

    private static void printWinners(Player[] winners) {
        int countWinners = winners.length;
        if (countWinners == 0) {
            System.out.println("Игра окончена: победителей нет!");
            return;
        }
        StringBuilder namesWinners = new StringBuilder();
        for (Player winner : winners) {
            namesWinners.append(winner.getName()).append(" ");
        }
        System.out.println("Игра окончена. В ней одержал(и) победу: " + namesWinners.toString().trim());
    }

    private static Player[] findWinner() {
        int maxWins = 0;
        int countWinners = 0;
        for (Player player : players) {
            if (player.getRoundWins() > maxWins) {
                maxWins = player.getRoundWins();
            }
        }
        if (maxWins == 0) {
            return new Player[0];
        }
        for (Player player : players) {
            if (player.getRoundWins() == maxWins) {
                countWinners++;
            }
        }
        Player[] winners = new Player[countWinners];
        int index = 0;
        for (Player player : players) {
            if (player.getRoundWins() == maxWins) {
                winners[index++] = player;
            }
        }
        return winners;
    }
}