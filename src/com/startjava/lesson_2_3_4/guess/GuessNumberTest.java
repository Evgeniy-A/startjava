package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = creatPlayer(scanner, "Введите имя первого игрока: ");
        Player player2 = creatPlayer(scanner, "Введите имя второго игрока: ");
        GuessNumber game = new GuessNumber(player1, player2);
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

    private static Player creatPlayer(Scanner scanner, String message) {
        System.out.println(message);
        return new Player(scanner.nextLine());
    }
}