package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String answerToQuestion;
        HangmanGame.playGame(scanner);
        do {
            System.out.println("Хотите повторить? ");
            answerToQuestion = scanner.nextLine().toLowerCase();
            if (answerToQuestion.equals("yes")) {
                HangmanGame.playGame(scanner);
            } else if (answerToQuestion.equals("no")) {
                break;
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
        } while (true);
    }
}