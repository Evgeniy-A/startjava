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
    private static String[] words;
    private String gameWord;
    private StringBuilder incorrectLetters;
    private StringBuilder wordMask;
    private int lengthWord;
    private int currentAttemts;

    public HangmanGame() {
        Random random = new Random();
        words = new String[]{"ПЕТЛЯ", "ВЕРЕВКА", "СТРАЖА", "ВИСИЛИЦА", "ПАЛАЧ"};
        gameWord = words[random.nextInt(words.length)];
        lengthWord = gameWord.length();
        incorrectLetters = new StringBuilder();
        wordMask = new StringBuilder("_".repeat(lengthWord));
        currentAttemts = gallows.length;
    }

    public void play(Scanner scanner) {
        do {
            printGameState();
            String guessedLetter = inputLetter(scanner);
            processGuess(guessedLetter);
        } while (!isGameEnded());
        printGameStatus();
    }

    private String inputLetter(Scanner scanner) {
        String guessedLetter;
        while (true) {
            System.out.print("Введите букву: ");
            guessedLetter = scanner.nextLine().toUpperCase();
            if (!isCyrillicLetter(guessedLetter)) {
                System.out.println("\nИспользуйте только русские буквы");
                printGameState();
                continue;
            }
            if (isRepeatedGuess(guessedLetter)) {
                System.out.println("\nТакая буква уже была, попробуйте другую");
                printGameState();
                continue;
            }
            break;
        }
        return guessedLetter;
    }

    private boolean isCyrillicLetter(String guessedLetter) {
        return guessedLetter.matches("[А-Яа-яЁё]");
    }

    private boolean isRepeatedGuess(String guessedLetter) {
        return (incorrectLetters.toString().contains(guessedLetter) ||
                wordMask.toString().contains(guessedLetter));
    }

    private int processGuess(String guessedLetter) {
        if (gameWord.contains(guessedLetter.toUpperCase())) {
            updateMaskWithLetter(guessedLetter);
            currentAttemts = Math.min(currentAttemts + 1, currentAttemts);
        } else {
            incorrectLetters.append(guessedLetter).append(" ");
            currentAttemts = Math.max(currentAttemts - 1, 0);
        }
        return currentAttemts;
    }

    private void updateMaskWithLetter(String guessedLetter) {
        for (int i = 0; i < lengthWord; i++) {
            if (gameWord.charAt(i) == guessedLetter.charAt(0)) {
                wordMask.setCharAt(i, guessedLetter.charAt(0));
            }
        }
    }

    private boolean isGameEnded() {
        return (currentAttemts == 0 || gameWord.equals(wordMask.toString()));
    }

    private void printGameStatus() {
        if (currentAttemts == 0) {
            printGallows();
            System.out.printf("Количество попыток: %d%n", currentAttemts);
            System.out.printf("Правильное слово: %s%nВы проиграли%n", gameWord);
        } else {
            System.out.println("Вы выиграли!");
        }
    }

    private void printGameState() {
        System.out.printf("%nОтгадайте слово: %s%n", wordMask);
        printGallows();
        if (!incorrectLetters.toString().isBlank()) {
            System.out.printf("Ошибочные буквы: %s%n", incorrectLetters);
        }
        System.out.printf("Количество попыток: %d%n", currentAttemts);
    }

    private void printGallows() {
        for (int i = 0; i < gallows.length - currentAttemts; i++) {
            System.out.println(gallows[i]);
        }
    }
}