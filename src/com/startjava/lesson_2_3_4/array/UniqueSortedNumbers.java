package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueSortedNumbers {
    public static void main(String[] args) {
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

    private static int[] fillUniqueNumbers(int leftBorder, int rightBorder, int numbersPerLine) {
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
        Arrays.sort(uniqueNumbers);
        return uniqueNumbers;
    }

    private static void printNumbers(int[] numbers,  int numbersPerLine) {
        if (numbers == null) {
            return;
        }
        if (numbersPerLine < 1) {
            System.out.printf("Ошибка: количество чисел в строке не должно быть < 1 (%d)%n%n",
                    numbersPerLine);
            return;
        }
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%3d ", numbers[i]);
            if ((i + 1) % numbersPerLine == 0) {
                System.out.println();
            }
        }
    }
}