package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] guessedNumbers;
    private int attemptCount;
    private int roundWins;

    public Player(String name) {
        this.name = name;
        guessedNumbers = new int[GuessNumber.MAX_ATTEMPTS];
        roundWins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGuessedNumbers() {
        return Arrays.copyOf(guessedNumbers, attemptCount);
    }

    public void setNumbers(int guessedNumber) {
        if (guessedNumber < GuessNumber.MIN_NUMBER || guessedNumber > GuessNumber.MAX_NUMBER) {
            throw new IllegalArgumentException(
                    String.format("Число должно входить в отрезок [%d, %d].\n" +
                                  "Попробуйте еще раз:", GuessNumber.MIN_NUMBER, GuessNumber.MAX_NUMBER));
        }
        guessedNumbers[attemptCount++] = guessedNumber;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }

    public int getRoundWins() {
        return roundWins;
    }

    public void setRoundWins(int roundWins) {
        this.roundWins = roundWins;
    }

    public void addWin() {
        roundWins++;
    }

    public void resetGuessedNumbers() {
        Arrays.fill(guessedNumbers, 0, attemptCount, 0);
        resetAttemptCount();
    }

    private void resetAttemptCount() {
        attemptCount = 0;
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