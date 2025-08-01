package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class UniqueSortNumbers {
    public static void main(String[] args) {
        int leftBorder = -30;
        int rightBorder = -10;
        int numbersPerLine = 23;
        printSortNumbers(createUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 10;
        rightBorder = 50;
        numbersPerLine = 10;
        printSortNumbers(createUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -34;
        rightBorder = -34;
        numbersPerLine = 0;
        printSortNumbers(createUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = -1;
        rightBorder = 2;
        numbersPerLine = -3;
        printSortNumbers(createUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
        leftBorder = 5;
        rightBorder = -8;
        numbersPerLine = 2;
        printSortNumbers(createUniqueNumbers(leftBorder, rightBorder, numbersPerLine), numbersPerLine);
    }

    private static int[] createUniqueNumbers(int leftBorder, int rightBorder, int numbersPerLine) {
        if (numbersPerLine < 1) {
            return null;
        }
        if (leftBorder > rightBorder) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n%n",
                    leftBorder, rightBorder);
            return null;
        }
        int length = (int) ((rightBorder - leftBorder + 1) * 0.75);
        if (length == 0) {
            System.out.printf("Ошибка: длина массива должна быть > 0 (%d)%n%n", length);
            return null;
        }
        Random random = new Random();
        int[] uniqueNumbers = new int[length];
        int temp;
        boolean isUnique;
        for (int i = 0; i < length; i++) {
            do {
                temp = random.nextInt(leftBorder, rightBorder + 1);
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == temp) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = temp;
        }
        return uniqueNumbers;
    }

    private static void printSortNumbers(int[] numbers,  int numbersPerLine) {
        if (numbersPerLine < 1) {
            System.out.printf("Ошибка: количество чисел в строке не должно быть < 1 (%d)%n%n",
                    numbersPerLine);
            return;
        }
        if (numbers == null) {
            return;
        }
        int length = numbers.length;
        int temp;
        for (int i = 0; i < length; i++) {
            temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.printf("%3d ", numbers[i]);
            if ((i + 1) % numbersPerLine == 0) {
                System.out.println();
            }
        }
    }
}