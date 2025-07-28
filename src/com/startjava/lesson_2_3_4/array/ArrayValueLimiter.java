package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayValueLimiter {
    public static void main(String[] args) {
        double[] randomNumbers = generateRandomNumbers();
        int limitIndex = -1;
        double[] filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilterResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 15;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilterResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 0;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilterResult(limitIndex, randomNumbers, filterNumbers);
        limitIndex = 14;
        filterNumbers = filterByIndexValue(limitIndex, randomNumbers);
        printFilterResult(limitIndex, randomNumbers, filterNumbers);
    }

    public static double[] generateRandomNumbers() {
        Random random = new Random();
        double[] randomNumbers = new double[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextDouble();
        }
        return randomNumbers;
    }

    public static double[] filterByIndexValue(int limitIndex, double[] randomNumbers) {
        int length = randomNumbers.length;
        if (limitIndex < 0 || limitIndex >= length) {
            System.out.printf("Ошибка, некорректное значение индекса: %d!" +
                    "\nЗначение должно быть в диапазоне [0, 14]\n", limitIndex);
            return new double[0];
        }
        double[] filterNumbers = new double[length];
        double indexValue = randomNumbers[limitIndex];
        for (int i = 0; i < length; i++) {
            filterNumbers[i] = (randomNumbers[i] > indexValue) ? 0.0 : randomNumbers[i];
        }
        return filterNumbers;
    }

    public static void printFilterResult(int limitIndex, double[] randomNumbers, double[] filterNumbers) {
        int length = filterNumbers.length;
        if (length == 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", randomNumbers[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", filterNumbers[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.printf("\n%.3f\n\n", randomNumbers[limitIndex]);
    }
}