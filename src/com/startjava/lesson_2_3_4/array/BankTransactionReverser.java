package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main(String[] args) {
        printResult(new int[0], reverse(new int[0]));
        printResult(null, reverse(null));
        printResult(new int[]{5}, reverse(new int[]{5}));
        printResult(new int[]{6, 8, 9, 1}, reverse(new int[]{6, 8, 9, 1}));
        printResult(new int[]{13, 8, 5, 3, 2, 1, 1}, reverse(new int[]{13, 8, 5, 3, 2, 1, 1}));
    }

    private static int[] reverse(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных, информация о транзакциях отсутствует");
            return null;
        }
        if (transactions.length == 0) {
            System.out.println("Пользователь еще не совершал транзакций");
            return new int[0];
        }
        int length = transactions.length - 1;
        int[] reversed = new int[transactions.length];
        for (int tr : transactions) {
            reversed[length--] = tr;
        }
        return reversed;
    }

    private static void printResult(int[] transactions, int[] reversed) {
        if (reversed != null && reversed.length != 0) {
            System.out.printf("Исходные транзакции: %s%n", Arrays.toString(transactions));
            System.out.printf(" В обратном порядке: %s%n", Arrays.toString(reversed));
        }
    }
}