package com.startjava.lesson_2_3_4.hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static String[] gallows = {
            "_______",
            "|     |",
            "|     @",
            "|    /|\\",
            "|    / \\",
            "| GAME OVER!"};
    private static String[] passwords = {"ПЕТЛЯ", "ВЕРЕВКА", "СТРАЖА", "ВИСИЛИЦА", "ПАЛАЧ"};
    private static int attemptCount;
    private static int lives;
    private static StringBuilder incorrectLetters;
    private static String gameWord;
    private static int lengthWord;
    private static StringBuilder maskWord;
    private static String guessedLetter;

    public static void playGame(Scanner scanner) {
        attemptCount = gallows.length;
        lives = attemptCount;
        incorrectLetters = new StringBuilder();
        Random random = new Random();
        gameWord = passwords[random.nextInt(5)];
        lengthWord = gameWord.length();
        maskWord = createMaskWord();
        do {
            printGameState();
            guessedLetter = scanner.nextLine().toUpperCase();
            if (!isValidGuess()) {
                System.out.println("Используйте только русские буквы");
                continue;
            } else if (isRepeatedGuess()) {
                System.out.println("%nТакая буква уже была, попробуйте другую%n");
                continue;
            }
            processGuess();
        } while (lives != 0 && !gameWord.equals(maskWord.toString()));
        printGameOver();
    }

    private static StringBuilder createMaskWord() {
        StringBuilder maskWord = new StringBuilder();
        maskWord.append("_".repeat(Math.max(0, lengthWord)));
        return maskWord;
    }

    private static void printGameState() {
        System.out.printf("%nОтгадайте слово: %s%n", maskWord);
        printGallows();
        System.out.printf("Количество попыток: %d%n", lives);
        printIncorrectLetters();
        System.out.print("Введите букву: ");
    }

    private static void printGallows() {
        for (int i = 0; i < attemptCount - lives; i++) {
            System.out.println(gallows[i]);
        }
    }

    private static void printIncorrectLetters() {
        if (!incorrectLetters.toString().isBlank()) {
            System.out.printf("Ошибочные буквы: %s%n", incorrectLetters);
        }
    }

    private static boolean isValidGuess() {
        return guessedLetter.matches("[А-Яа-яЁё]");
    }

    private static boolean isRepeatedGuess() {
        return (incorrectLetters.toString().contains(guessedLetter) ||
                maskWord.toString().contains(guessedLetter));
    }

    private static int processGuess() {
        if (gameWord.contains(guessedLetter.toUpperCase())) {
            updateMaskWithLetter();
            lives = Math.min(lives + 1, attemptCount);
        } else {
            incorrectLetters.append(guessedLetter).append(" ");
            lives = Math.max(lives - 1, 0);
        }
        return lives;
    }

    private static void updateMaskWithLetter() {
        for (int i = 0; i < lengthWord; i++) {
            if (gameWord.charAt(i) == guessedLetter.charAt(0)) {
                maskWord.setCharAt(i, guessedLetter.charAt(0));
            }
        }
    }

    private static void printGameOver() {
        if (lives == 0) {
            printGallows();
            System.out.printf("Количество попыток: %d%n", lives);
            System.out.printf("Правильное слово: %s%nВы проиграли%n", gameWord);
        } else {
            System.out.println("Вы выиграли!");
        }
    }
}