package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play(Scanner scanner) {
        Player currPlayer = player1;
        Random random = new Random();
        int targetNum = random.nextInt(1, 101);
        int playerGuess = 0;
        while (playerGuess != targetNum) {
            System.out.printf("%s ввел число: ", currPlayer.getName());
            playerGuess = scanner.nextInt();
            scanner.nextLine();
            if (playerGuess > targetNum) {
                System.out.printf("%d больше того, что загадал компьютер%n", playerGuess);
            } else if (playerGuess < targetNum) {
                System.out.printf("%d меньше того, что загадал компьютер%n", playerGuess);
            } else {
                System.out.printf("Победил игрок : %s%n", currPlayer.getName());
            }
            currPlayer = (currPlayer == player1) ? player2 : player1;
        }
    }
}