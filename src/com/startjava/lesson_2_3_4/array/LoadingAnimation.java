package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class LoadingAnimation {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        runSpinner();
        printResult();
    }

    private static void runSpinner() throws InterruptedException {
        char[] spinnerSymbols = new char[]{'-', '\\', '|', '/'};
        for (int i = 0; i < 3; i++) {
            for (char symbol : spinnerSymbols) {
                System.out.print("\rHacking : " + symbol);
                Thread.sleep(250);
            }
        }
    }

    private static void printResult() {
        System.out.print("\rHacking :");
        Random random = new Random();
        int randomValue = random.nextInt(100);
        if (randomValue > 70) {
            System.out.print(ANSI_RED + " Access Granted!" + ANSI_RESET);
        } else {
            System.out.print(ANSI_GREEN + " Access Denied!" + ANSI_RESET);
        }
    }
}