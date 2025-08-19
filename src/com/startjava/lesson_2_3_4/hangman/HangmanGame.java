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
    private static String[] words = {"ПЕТЛЯ", "ВЕРЕВКА", "СТРАЖА", "ВИСИЛИЦА", "ПАЛАЧ"};
    private String gameWord;
    private String guessedLetter;
    private StringBuilder incorrectLetters;
    private StringBuilder wordMask;
    private int lengthWord;
    private int attemptCount;
    private int lives;

    public HangmanGame() {
        Random random = new Random();
        gameWord = words[random.nextInt(5)];
        lengthWord = gameWord.length();
        guessedLetter = new String();
        incorrectLetters = new StringBuilder();
        wordMask = createWordMask();
        attemptCount = gallows.length;
        lives = attemptCount;
    }

    public void playGame(Scanner scanner) {
        do {
            printGameState();
            inputValidLetter(scanner);
            processGuess();
        } while (!isGameEnded());
        printGameStatus();
    }

    private StringBuilder createWordMask() {
        StringBuilder maskWord = new StringBuilder();
        maskWord.append("_".repeat(lengthWord));
        return maskWord;
    }

    private void printGameState() {
        System.out.printf("%nОтгадайте слово: %s%n", wordMask);
        printGallows();
        System.out.printf("Количество попыток: %d%n", lives);
        printIncorrectLetters();
        System.out.print("Введите букву: ");
    }

    private void printGallows() {
        for (int i = 0; i < attemptCount - lives; i++) {
            System.out.println(gallows[i]);
        }
    }

    private void printIncorrectLetters() {
        if (!incorrectLetters.toString().isBlank()) {
            System.out.printf("Ошибочные буквы: %s%n", incorrectLetters);
        }
    }

    private void inputValidLetter(Scanner scanner) {
        while (true) {
            guessedLetter = scanner.nextLine().toUpperCase();
            if (!isCyrillicLetter()) {
                printCyrillicLetterError();
                printGameState();
                continue;
            }
            if (isRepeatedGuess()) {
                printRepeatedGuess();
                printGameState();
                continue;
            }
            break;
        }
    }

    private boolean isCyrillicLetter() {
        return guessedLetter.matches("[А-Яа-яЁё]");
    }

    private void printCyrillicLetterError() {
        System.out.println("\nИспользуйте только русские буквы");
    }

    private boolean isRepeatedGuess() {
        return (incorrectLetters.toString().contains(guessedLetter) ||
                wordMask.toString().contains(guessedLetter));
    }

    private void printRepeatedGuess() {
        System.out.println("\nТакая буква уже была, попробуйте другую");
    }

    private int processGuess() {
        if (gameWord.contains(guessedLetter.toUpperCase())) {
            updateMaskWithLetter();
            lives = Math.min(lives + 1, attemptCount);
        } else {
            incorrectLetters.append(guessedLetter).append(" ");
            lives = Math.max(lives - 1, 0);
        }
        return lives;
    }

    private void updateMaskWithLetter() {
        for (int i = 0; i < lengthWord; i++) {
            if (gameWord.charAt(i) == guessedLetter.charAt(0)) {
                wordMask.setCharAt(i, guessedLetter.charAt(0));
            }
        }
    }

    private boolean isGameEnded() {
        return (lives == 0 || gameWord.equals(wordMask.toString()));
    }

    private void printGameStatus() {
        if (lives == 0) {
            printGallows();
            System.out.printf("Количество попыток: %d%n", lives);
            System.out.printf("Правильное слово: %s%nВы проиграли%n", gameWord);
        } else {
            System.out.println("Вы выиграли!");
        }
    }
}

