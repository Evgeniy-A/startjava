package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Console.isBorderError;
import static com.startjava.lesson_2_3_4.array.Console.isValidArrayConditions;
import static com.startjava.lesson_2_3_4.array.Console.printHackAnimation;

import java.util.Random;

public class Arrays {
    private Arrays() {
    }

    public static long[] calculateFactorial(int... nums) {
        if (nums == null) {
            return null;
        }
        int length = nums.length;
        if (length == 0) {
            return new long[0];
        }
        long[] factorials = new long[length];
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            long result = 1;
            for (int j = 1; j <= nums[i]; j++) {
                result *= j;
            }
            factorials[i] = result;
        }
        return factorials;
    }

    public static int[] fillUniqueNumbers(int leftBorder, int rightBorder, int numbersPerLine) {
        if (isBorderError(leftBorder, rightBorder)) {
            return null;
        }
        int length = (int) ((rightBorder - leftBorder + 1) * 0.75);
        if (!isValidArrayConditions(numbersPerLine, length)) {
            return null;
        }
        Random random = new Random();
        int[] uniqueNumbers = new int[length];
        boolean isUnique;
        for (int i = 0; i < length; i++) {
            int currNumber;
            do {
                currNumber = random.nextInt(leftBorder, rightBorder + 1);
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == currNumber) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = currNumber;
        }
        java.util.Arrays.sort(uniqueNumbers);
        return uniqueNumbers;
    }

    public static float[] filterByIndexValue(int limitIndex, float[] nums) {
        int length = nums.length;
        if (limitIndex < 0 || limitIndex >= length) {
            return new float[0];
        }
        float[] filteredNumbers = new float[length];
        float indexValue = nums[limitIndex];
        for (int i = 0; i < length; i++) {
            filteredNumbers[i] = (nums[i] > indexValue) ? 0.0f : nums[i];
        }
        return filteredNumbers;
    }

    public static char[] generateSortedChars(char leftBorder, char rightBorder, boolean isAscending) {
        if (isBorderError(leftBorder, rightBorder)) {
            return null;
        }
        int length = rightBorder - leftBorder + 1;
        char[] sortedChars = new char[length];
        int step = isAscending ? 1 : -1;
        char startSymbol = isAscending ? leftBorder : rightBorder;
        for (int i = 0; i < length; i++) {
            sortedChars[i] = startSymbol;
            startSymbol += step;
        }
        return sortedChars;
    }

    public static float[] generateRandomNumbers() {
        Random random = new Random();
        float[] randomNumbers = new float[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextFloat();
        }
        return randomNumbers;
    }

    public static int hack() throws InterruptedException {
        printHackAnimation();
        return new Random().nextInt(100);
    }

    public static int[] reverse(int[] nums) {
        if (nums == null) {
            return null;
        }
        int length = nums.length;
        if (length == 0) {
            return new int[0];
        }
        int[] reversed = new int[length];
        for (int tr : nums) {
            reversed[--length] = tr;
        }
        return reversed;
    }

    public static String upperCaseWordRange(String input) {
        if (input == null) {
            return null;
        }
        if (input.isBlank()) {
            return "";
        }
        String[] inputWords = input.split("[\\s]+");
        int length = inputWords.length;
        int maxWordIndex = -1;
        int minWordIndex = -1;
        int maxWordLength = Integer.MIN_VALUE;
        int minWordLength = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (inputWords[i].matches("[\\p{Punct}]+")) {
                continue;
            }
            int lengthWord = inputWords[i].length();
            if (maxWordLength < lengthWord) {
                maxWordLength = lengthWord;
                maxWordIndex = i;
            } else if (minWordLength > lengthWord) {
                minWordLength = lengthWord;
                minWordIndex = i;
            }
        }
        int startUpperCaseIndex = Math.min(maxWordIndex, minWordIndex);
        int endUpperCaseIndex = Math.max(maxWordIndex, minWordIndex);
        StringBuilder resultLine = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != length - 1 && inputWords[i].contains("-") && inputWords[i + 1].matches(".*[A-Z].*")) {
                resultLine.append('\n').append(inputWords[i]).append(" ");
                continue;
            }
            if (i >= startUpperCaseIndex && i <= endUpperCaseIndex) {
                resultLine.append(inputWords[i].toUpperCase()).append(" ");
                continue;
            }
            resultLine.append(inputWords[i]).append(" ");
        }
        return resultLine.toString().trim();
    }
}