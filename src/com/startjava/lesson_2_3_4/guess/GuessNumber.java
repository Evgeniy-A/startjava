package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int PLAYERS_COUNT = 3;
    public static final int ROUNDS_COUNT = 3;

    private Player[] players = new Player[PLAYERS_COUNT];
    private int currentPlayerIndex = 0;

    public GuessNumber(Scanner scanner) {
        for (int i = 0; i < players.length; i++) {
            System.out.printf("Введите имя %d-ого игрока: ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
    }

    public void play(Scanner scanner) throws InterruptedException {
        Random random = new Random();
        castLots(random);
        System.out.printf("%nИгра началась! У каждого игрока по %d попыток%n", MAX_ATTEMPTS);
        Player currPlayer = players[0];
        for (int i = 1; i <= ROUNDS_COUNT; i++) {
            int secretNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER + 1);
            System.out.printf("РАУНД %d%n", i);
            while (hasAttempts(currPlayer)) {
                System.out.printf("Попытка %d%nЧисло вводит %s: ",
                        currPlayer.getAttemptCount() + 1, currPlayer.getName());
                int playerNumber = enterNumber(currPlayer, scanner);
                printCheckNumberMessage(playerNumber, secretNumber);
                if (playerNumber == secretNumber) {
                    currPlayer.incrementWin();
                    break;
                }
                currPlayer = changePlayerIndex();
            }
            printRoundGuessedNumbers();
            resetPlayersForNewRound();
        }
        printWinners(findWinners());
    }

    private void castLots(Random random) throws InterruptedException {
        for (int i = players.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[randomIndex];
            players[randomIndex] = temp;
        }
        animateCastLots();
    }

    private void animateCastLots() throws InterruptedException {
        String message = "Бросаем жребий, чтобы определить, кто будет угадывать первым...";
        System.out.println(message);
        printDrawOrder();
    }

    private void printDrawOrder() throws InterruptedException {
        System.out.print("Жребий:  ");
        char[] spins = {'-', '\\', '|', '/'};
        for (int i = 0; i < spins.length * 3; i++) {
            System.out.print("\b" + spins[i % 4]);
            Thread.sleep(250);
        }
        System.out.print("\b");
        for (Player player : players) {
            System.out.print(player.getName() + " ");
        }
    }

    private boolean hasAttempts(Player currPlayer) {
        if (currPlayer.getAttemptCount() == MAX_ATTEMPTS) {
            System.out.printf("У %s закончились попытки!%n", currPlayer.getName());
            return false;
        }
        return true;
    }

    private int enterNumber(Player currPlayer, Scanner scanner) {
        while (true) {
            try {
                int playerNumber = scanner.nextInt();
                scanner.nextLine();
                currPlayer.addGuessedNumber(playerNumber);
                return playerNumber;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.nextLine();
            }
        }
    }

    private void printCheckNumberMessage(int playerNumber, int secretNumber) {
        if (playerNumber == secretNumber) {
            System.out.print("Угадал!!!\n");
            return;
        }
        String checkMessage = (playerNumber > secretNumber) ? "больше" : "меньше";
        System.out.printf("%d %s загаданного числа%n", playerNumber, checkMessage);
    }

    private Player changePlayerIndex() {
        currentPlayerIndex = (currentPlayerIndex + 1) % PLAYERS_COUNT;
        return players[currentPlayerIndex];
    }

    private void printRoundGuessedNumbers() {
        System.out.println("Раунд завершен!\nИгроки ввели следующие числа: ");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player);
        }
    }

    private void resetPlayersForNewRound() {
        for (Player player : players) {
            player.resetGameState();
        }
    }

    private Player[] findWinners() {
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

    private void printWinners(Player[] winners) {
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
}