package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] guessedNumbers;
    private int attemptCount;

    public Player(String name) {
        this.name = name;
        this.guessedNumbers = new int[GuessNumber.MAX_ATTEMPTS];
        this.attemptCount = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getGuessedNumbers() {
        return Arrays.copyOf(guessedNumbers, attemptCount);
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setNumber(int guessedNumber) {
        if (GuessNumber.MIN_NUMBER > guessedNumber || guessedNumber > GuessNumber.MAX_NUMBER) {
            throw new IllegalArgumentException(
                    String.format("Число должно входить в отрезок [%d, %d].\n" +
                                  "Попробуйте еще раз:", GuessNumber.MIN_NUMBER, GuessNumber.MAX_NUMBER));
        }
        guessedNumbers[attemptCount++] = guessedNumber;
    }

    private void setAttemptCount() {
        attemptCount = 0;
    }

    public void resetGuessedNumbers() {
        Arrays.fill(guessedNumbers, 0, attemptCount, 0);
        setAttemptCount();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int number : getGuessedNumbers()) {
            sb.append(number).append(" ");
        }
        return sb.toString().trim();
    }
}