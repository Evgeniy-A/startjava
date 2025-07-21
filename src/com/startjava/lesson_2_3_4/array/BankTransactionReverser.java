package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {

    public static void main(String[] args) {
        printResult(new int[0], transactionRevers(new int[0]));
        printResult(null, transactionRevers(null));
        printResult(new int[]{5}, transactionRevers(new int[]{5}));
        printResult(new int[]{6, 8, 9, 1}, transactionRevers(new int[]{6, 8, 9, 1}));
        printResult(new int[]{13, 8, 5, 3, 2, 1, 1}, transactionRevers(new int[]{13, 8, 5, 3, 2, 1, 1}));
    }

    public static int[] transactionRevers(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных, информация о транзакциях отсутствует");
            return null;
        }
        if (transactions.length == 0) {
            System.out.println("Пользователь еще не совершал транзакций");
            return new int[0];
        }
        int length = transactions.length;
        int[] reversTransactions = new int[length];
        int count = length - 1;
        for (int transaction : transactions) {
            reversTransactions[count--] = transaction;
        }
        return reversTransactions;
    }

    public static void printResult(int[] transactions, int[] reversTransactions) {
        if (reversTransactions != null && reversTransactions.length != 0) {
            System.out.printf("Исходные транзакции: %s%n", Arrays.toString(transactions));
            System.out.printf(" В обратном порядке: %s%n", Arrays.toString(reversTransactions));
        }
    }
}