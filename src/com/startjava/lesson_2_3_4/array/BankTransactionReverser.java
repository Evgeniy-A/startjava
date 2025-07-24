package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main(String[] args) {
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

    private static int[] reverse(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных, информация о транзакциях отсутствует");
            return null;
        }
        int length = transactions.length;
        if (length == 0) {
            System.out.println("Пользователь еще не совершал транзакций");
            return new int[0];
        }
        int[] reversed = new int[length];
        for (int tr : transactions) {
            reversed[--length] = tr;
        }
        return reversed;
    }

    private static void printTransactionsWithReversed(int[] transactions, int[] reversed) {
        if (reversed != null && reversed.length != 0) {
            System.out.printf("Исходные транзакции: %s%n", Arrays.toString(transactions));
            System.out.printf(" В обратном порядке: %s%n", Arrays.toString(reversed));
        }
    }
}