package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        do {
            hangmanGame.playGame(scanner);
        } while (askToRepeat(scanner));
    }

    private static boolean askToRepeat(Scanner scanner) {
        while (true) {
            System.out.println("Хотите повторить игру? [yes / no]");
            String answerToQuestion = scanner.nextLine();
            if (answerToQuestion.equals("yes")) {
                return true; 
            }
            if (answerToQuestion.equals("no")) {
                return false;
            }
            System.out.println("Введите корректный ответ [yes / no]:");
        }
    }
}