package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class HackingSimulator {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        printAccessResult(hack());
    }

    private static int hack() throws InterruptedException {
        char[] spins = {'-', '\\', '|', '/'};
        for (int i = 0; i < 12; i++) {
            System.out.print("\rHacking: " + spins[i % 4]);
            Thread.sleep(250);
        }
        return new Random().nextInt(100);
    }

    private static void printAccessResult(int accessCode) {
        String message = (accessCode > 70 ? ANSI_RED + "Access Granted!" : ANSI_GREEN + "Access Denied!");
        System.out.printf("\rHacking: %s" + ANSI_RESET, message);
    }
}