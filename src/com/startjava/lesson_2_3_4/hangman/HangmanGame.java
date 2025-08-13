package com.startjava.lesson_2_3_4.hangman;

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static final String[] GALLOWS = {"_______", "|     |", "|     @",
            "|    /|\\", "|    / \\", "| GAME OVER!"};
    private static final String[] PASSWORDS = {"ПЕТЛЯ", "ВЕРЕВКА", "СТРАЖА", "ВИСИЛИЦА", "ПАЛАЧ"};

    public static void game() throws InterruptedException {
        int attemptCount = GALLOWS.length;
        int lives = attemptCount;
        Random random = new Random();
        String gameWord = PASSWORDS[random.nextInt(5)];
        int lengthWord = gameWord.length();
        StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < lengthWord; i++) {
            guessedWord.append("_");
        }
        String maskWord = guessedWord.toString();
        StringBuilder incorrectLetters = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите букву: ");
            String guessedLetter = scanner.nextLine().toUpperCase();
            if (!guessedLetter.matches("[А-Яа-яЁё]")) {
                System.out.println("Используйте только русские буквы");
                continue;
            }
            if (incorrectLetters.toString().contains(guessedLetter) ||
                    guessedWord.toString().contains(guessedLetter)) {
                System.out.println("Такая буква уже была, попробуйте другую");
                continue;
            }
            if (gameWord.contains(guessedLetter.toUpperCase())) {
                for (int i = 0; i < lengthWord; i++) {
                    if (gameWord.charAt(i) == guessedLetter.charAt(0)) {
                        guessedWord.setCharAt(i, guessedLetter.charAt(0));
                    }
                }
                lives = min(lives + 1, attemptCount);
            } else {
                incorrectLetters.append(guessedLetter).append(" ");
                lives = max(lives - 1, 0);
            }
            System.out.printf("%nОтгадайте слово: %s", maskWord);
            System.out.printf("%nВы отгадали: %s%n", guessedWord);
            for (int i = 0; i < attemptCount - lives; i++) {
                System.out.println(GALLOWS[i]);
                Thread.sleep(400);
            }
            System.out.printf("%nКоличество попыток: %d", lives);
            System.out.printf("%nОшибочные буквы: %s%n", incorrectLetters);
        } while (lives != 0 && !gameWord.equals(guessedWord.toString()));
        if (lives == 0) {
            System.out.printf("%nПравильное слово: %s%nВы проиграли%n", gameWord);
        } else {
            System.out.println("Вы выиграли!");
        }
        String answerToQuestion;
        System.out.println("Хотите повторить? ");
        do {
            answerToQuestion = scanner.nextLine().toLowerCase();
            if (answerToQuestion.equals("yes")) {
                game();
            } else if (!answerToQuestion.equals("no")) {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
        } while (!answerToQuestion.equals("yes") && !answerToQuestion.equals("no"));
    }
}