package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Arrays.*;
import static com.startjava.lesson_2_3_4.array.Console.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        reverseBankTransaction();
        simulateHacking();
        printFactorials();
        limitArrayValues();
        printSortedCharTriangle();
        sortedRandomArray();
        showTypewriterEffect();
    }

    private static void reverseBankTransaction() {
        int[] transactions = new int[0];
        printTransactionsWithReversed(transactions, reverse(transactions));
        transactions = null;
        printTransactionsWithReversed(transactions, reverse(transactions));
        transactions = new int[]{5};
        printTransactionsWithReversed(transactions, reverse(transactions));
        transactions = new int[]{6, 8, 9, 1};
        printTransactionsWithReversed(transactions, reverse(transactions));
        transactions = new int[]{13, 8, 5, 3, 2, 1, 1};
        printTransactionsWithReversed(transactions, reverse(transactions));
    }

    private static void simulateHacking() throws InterruptedException {
        printAccessResult(hack());
    }

    private static void printFactorials() {
        var nums = new int[0];
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = null;
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{8, 0, 9};
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{-3, 1, 7, 13};
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{-22, -0};
        printFactorialExpression(calculateFactorial(nums), nums);
    }

    private static void limitArrayValues() {
        float[] randomNumbers = generateRandomNumbers();
        int[] limitIndexes = {-1, 15, 0, 14};
        for (int index : limitIndexes) {
            float[] filterNumbers = filterByIndexValue(index, randomNumbers);
            printFilteredResult(index, randomNumbers, filterNumbers);
        }
    }

    private static void printSortedCharTriangle() {
        printTriangle(generateSortedChars('0', '9', true));
        printTriangle(generateSortedChars('/', '!', false));
        printTriangle(generateSortedChars('A', 'J', false));
    }

    private static void sortedRandomArray() {
        int leftBorder = -30;
        int rightBorder = -10;
        int numbersPerLine = 23;
        printNumbersPerLine(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 10;
        rightBorder = 50;
        numbersPerLine = 10;
        printNumbersPerLine(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -34;
        rightBorder = -34;
        numbersPerLine = 0;
        printNumbersPerLine(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -1;
        rightBorder = 2;
        numbersPerLine = -3;
        printNumbersPerLine(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 5;
        rightBorder = -8;
        numbersPerLine = 2;
        printNumbersPerLine(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
    }

    private static void showTypewriterEffect() throws InterruptedException {
        type(upperCaseWordRange("Java - это C++, " +
                                "из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling"));
        type(upperCaseWordRange("Чтобы написать чистый код, " +
                                "мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin"));
        type(upperCaseWordRange(null));
        type(upperCaseWordRange(""));
    }
}