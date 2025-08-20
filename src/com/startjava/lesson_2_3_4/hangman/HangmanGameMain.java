package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerToQuestion = "yes";
        while (!answerToQuestion.equals("no")) {
            if (!answerToQuestion.equals("yes")) {
                System.out.println("Введите корректный ответ [yes / no]: ");
                answerToQuestion = scanner.nextLine();
                continue;
            }
            HangmanGame game = new HangmanGame();
            game.play(scanner);
            System.out.println("Хотите повторить игру? [yes / no]");
            answerToQuestion = scanner.nextLine();
        }
    }
}