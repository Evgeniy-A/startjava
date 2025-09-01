//package com.startjava.lesson_2_3_4.guess;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        int[] numbers = {0, 1, 2};
//        Random random = new Random();
//        for (int i = numbers.length - 1; i > 0; i--) {
//            int randomIndex = random.nextInt(i + 1);
//            int temp = numbers[i];
//            numbers[i] = numbers[randomIndex];
//            numbers[randomIndex] = temp;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
//
//
//    public void play(Scanner scanner) {
//        Random random = new Random();
//        Player currPlayer = player2;
//        int secretNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
//        int playerNumber = 0;
//        System.out.printf("Игра началась! У каждого игрока по %d попыток%n", MAX_ATTEMPTS);
//        while (playerNumber != secretNumber) {
//            currPlayer = changePlayer(currPlayer);
//            System.out.printf("Попытка %d%nЧисло вводит %s: ",
//                    currPlayer.getAttemptCount() + 1, currPlayer.getName());
//            playerNumber = enterNumber(currPlayer, scanner);
//            printCheckNumberMessage(playerNumber, secretNumber);
//            if(isDraw(currPlayer)) {
//                break;
//            }
//        }
//        if (!isDraw(currPlayer)) {
//            System.out.printf("%s угадал(а) число %d c %d-й попытки%n",
//                    currPlayer.getName(), secretNumber, currPlayer.getAttemptCount());
//        }
//        System.out.println(player1);
//        System.out.println(player2);
//        player1.resetGuessedNumbers();
//        player2.resetGuessedNumbers();
//    }
//
//    private Player changePlayer(Player currPlayer) {
//        return (currPlayer == player2) ? player1 : player2;
//    }
//
//    private static int enterNumber(Player currPlayer, Scanner scanner) {
//        while (true) {
//            int playerNumber = scanner.nextInt();
//            scanner.nextLine();
//            try {
//                currPlayer.setNumber(playerNumber);
//                return playerNumber;
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//    private static void printCheckNumberMessage(int playerNumber, int secretNumber) {
//        String checkMessage = (playerNumber > secretNumber) ? "больше" : "меньше";
//        System.out.printf("%d %s загаданного числа%n", playerNumber, checkMessage);
//    }
//
//    private boolean isDraw(Player currPlayer) {
//        if (currPlayer.getAttemptCount() == MAX_ATTEMPTS) {
//            System.out.printf("У %s закончились попытки!%n", currPlayer.getName());
//            if (player1.getAttemptCount() == MAX_ATTEMPTS &&
//                player2.getAttemptCount() == MAX_ATTEMPTS) {
//                System.out.println("У игроков закончились попытки. Ничья!");
//                return true;
//            }
//        }
//        return false;
//    }
//}
//}
