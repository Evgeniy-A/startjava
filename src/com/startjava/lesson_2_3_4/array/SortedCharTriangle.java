package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;

public class SortedCharTriangle {
    public static void main(String[] args) {
        printTriangle(generateChars('0', '9', true));
        printTriangle(generateChars('/', '!', false));
        printTriangle(generateChars('A', 'J', false));
    }

    public static char[] generateChars(char leftBorder, char rightBorder, boolean isAscending) {
        if (leftBorder > rightBorder) {
            System.out.printf("%nОшибка: левая граница (%d) > правой (%d)%n",
                    (int) leftBorder, (int) rightBorder);
            return null;
        }
        int length = rightBorder - leftBorder + 1;
        char[] sortedChars = new char[length];
        int step = isAscending ? 1 : -1;
        char startSymbol = isAscending ? leftBorder : rightBorder;
        for (int i = 0; i < length; i++) {
            sortedChars[i] = startSymbol;
            startSymbol += step;
        }
        return sortedChars;
    }

    public static void printTriangle(char[] charsForTriangle) {
        if (charsForTriangle == null) {
            return;
        }
        StringBuilder triangle = new StringBuilder();
        int maxWidth = charsForTriangle.length;
        for (int i = 0; i < charsForTriangle.length; i++) {
            int spaces = maxWidth - i - 1;
            triangle.append(" ".repeat(spaces))
                    .append(Character.toString(charsForTriangle[i]).repeat(2 * i + 1))
                    .append("\n");
        }
        System.out.println(triangle);
    }
}