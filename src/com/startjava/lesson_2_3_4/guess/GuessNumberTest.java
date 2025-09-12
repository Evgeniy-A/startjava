package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String answerToQuestion = "yes";
        while (!answerToQuestion.equals("no")) {
            if (answerToQuestion.equals("yes")) {
                GuessNumber game = new GuessNumber(scanner);
                game.play(scanner);
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answerToQuestion = scanner.nextLine();
        }
    }
}