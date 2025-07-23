package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class LoadingAnimation {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        printAccessResult(runHackingProcess());
    }

    private static int runHackingProcess() throws InterruptedException {
        char[] spinnerSymbols = new char[]{'-', '\\', '|', '/'};
        for (int i = 0; i < 3; i++) {
            for (char symbol : spinnerSymbols) {
                System.out.print("\rHacking: " + symbol);
                Thread.sleep(250);
            }
        }
        int accessCode = new Random().nextInt(100);
        return accessCode;
    }

    private static void printAccessResult(int accessCode) {
        System.out.print("\rHacking:");
        if (accessCode > 70) {
            System.out.print(ANSI_RED + " Access Granted!" + ANSI_RESET);
        } else {
            System.out.print(ANSI_GREEN + " Access Denied!" + ANSI_RESET);
        }
    }
}