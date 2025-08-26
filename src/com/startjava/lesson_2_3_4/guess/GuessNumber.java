package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(Scanner scanner) {
        Random random = new Random();
        Player currPlayer = player2;
        int secretNumber = random.nextInt(1, 101);
        int playerNumber = 0;
        System.out.printf("Игра началась! У каждого игрока по %d попыток%n", MAX_ATTEMPTS);
        while (playerNumber != secretNumber) {
            currPlayer = (currPlayer == player2) ? player1 : player2;
            System.out.printf("Попытка %d%nЧисло вводит %s: ",
                    currPlayer.getAttemptCount() + 1, currPlayer.getName());
            playerNumber = enterNumber(currPlayer, scanner);
            printCheckNumberMessage(playerNumber, secretNumber);
            if (currPlayer.getAttemptCount() == MAX_ATTEMPTS) {
                System.out.printf("У %s закончились попытки!%n", currPlayer.getName());
                if (isDraw()) {
                    System.out.println("У игроков закончились попытки. Ничья!");
                    break;
                }
            }
        }
        if (!isDraw()) {
            System.out.printf("%s угадал(а) число %d c %d-й попытки%n",
                    currPlayer.getName(), secretNumber, currPlayer.getAttemptCount());
        }
        System.out.println(player1);
        System.out.println(player2);
        player1.resetGuessedNumbers();
        player2.resetGuessedNumbers();
    }

    private static int enterNumber(Player currPlayer, Scanner scanner) {
        while (true) {
            int playerGuess = scanner.nextInt();
            scanner.nextLine();
            try {
                currPlayer.setNumber(playerGuess);
                return playerGuess;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printCheckNumberMessage(int playerNumber, int secretNumber) {
        String checkMessage = (playerNumber > secretNumber) ? "больше" : "меньше";
        System.out.printf("%d %s загаданного числа%n", playerNumber, checkMessage);
    }

    private boolean isDraw() {
        return (player1.getAttemptCount() == MAX_ATTEMPTS &&
                player2.getAttemptCount() == MAX_ATTEMPTS);
    }
}