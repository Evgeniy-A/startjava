package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayValueLimiter {
    public static void main(String[] args) {
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

    private static float[] generateRandomNumbers() {
        Random random = new Random();
        float[] randomNumbers = new float[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextFloat();
        }
        return randomNumbers;
    }

    private static float[] filterByIndexValue(int limitIndex, float[] randomNumbers) {
        int length = randomNumbers.length;
        if (limitIndex < 0 || limitIndex >= length) {
            System.out.printf("Ошибка, некорректное значение индекса: %d!" +
                    "\nЗначение должно быть в диапазоне [0, 14]\n", limitIndex);
            return new float[0];
        }
        float[] filteredNumbers = new float[length];
        float indexValue = randomNumbers[limitIndex];
        for (int i = 0; i < length; i++) {
            filteredNumbers[i] = (randomNumbers[i] > indexValue) ? 0.0f : randomNumbers[i];
        }
        return filteredNumbers;
    }

    private static void printFilteredResult(int limitIndex, float[] randomNumbers, float[] filteredNumbers) {
        int length = filteredNumbers.length;
        if (length == 0) {
            return;
        }
        printNumbers(randomNumbers);
        printNumbers(filteredNumbers);
        System.out.printf("%.3f%n%n", randomNumbers[limitIndex]);
    }

    private static void printNumbers(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f ", numbers[i]);
            if (i == 7) {
                System.out.printf("%n");
            }
        }
        System.out.printf("%n%n");
    }
}