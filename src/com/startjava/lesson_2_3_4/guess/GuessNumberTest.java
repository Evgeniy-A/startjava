package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = creatGame(scanner);
        String answerToQuestion = "yes";
        while (!answerToQuestion.equals("no")) {
            if (answerToQuestion.equals("yes")) {
                game.play(scanner);
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answerToQuestion = scanner.nextLine();
        }
    }

    private static GuessNumber creatGame(Scanner scanner) {
        String[] names = new String[GuessNumber.COUNT_PLAYERS];
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Введите имя %d-ого игрока: ", i + 1);
            names[i] = scanner.nextLine();
        }
        return new GuessNumber(names);
    }
}