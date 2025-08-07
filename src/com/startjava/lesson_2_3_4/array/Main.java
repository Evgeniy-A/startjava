package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Arrays.*;
import static com.startjava.lesson_2_3_4.array.Console.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        bankTransactionReverse();
        hackingSimulator();
        factorialPrintExpression();
        arrayValueLimiter();
        sortedCharTriangle();
        randomSortArray();
        typewriterEffect();
    }

    public static void bankTransactionReverse() {
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

    public static void hackingSimulator() throws InterruptedException {
        printAccessResult(hack());
    }

    public static void factorialPrintExpression() {
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

    public static void arrayValueLimiter() {
        float[] randomNumbers = generateRandomNumbers();
        int limitIndex = -1;
        float[] filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilteredResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 15;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilteredResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 0;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilteredResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 14;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilteredResult(limitIndex, randomNumbers, filterNumbers);
    }

    public static void sortedCharTriangle() {
        printTriangle(generateChars('0', '9', true));
        printTriangle(generateChars('/', '!', false));
        printTriangle(generateChars('A', 'J', false));
    }

    public static void randomSortArray() {
        int leftBorder = -30;
        int rightBorder = -10;
        int numbersPerLine = 23;
        printNumbers(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 10;
        rightBorder = 50;
        numbersPerLine = 10;
        printNumbers(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -34;
        rightBorder = -34;
        numbersPerLine = 0;
        printNumbers(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -1;
        rightBorder = 2;
        numbersPerLine = -3;
        printNumbers(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 5;
        rightBorder = -8;
        numbersPerLine = 2;
        printNumbers(fillUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
    }

    public static void typewriterEffect()
                throws InterruptedException {
        type(upperCaseWordRange("Java - это C++, " +
                                "из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling"));
        type(upperCaseWordRange("Чтобы написать чистый код, " +
                                "мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin"));
        type(upperCaseWordRange(null));
        type(upperCaseWordRange(""));
    }
}