package com.startjava.lesson_2_3_4.array;

public class SortedCharTriangle {
    public static void main(String[] args) {
        printTriangle(generateChars('0', '9', true));
        printTriangle(generateChars('/', '!', false));
        printTriangle(generateChars('A', 'J', false));
    }

    public static char[] generateChars(char leftBorder, char rightBorder, boolean isAscending) {
        int step;
        if (isAscending) {
            if (leftBorder > rightBorder) {
                System.out.printf("Ошибка: левая граница (%d) > правой (%d)\n",
                            (int) leftBorder, (int) rightBorder);
                return null;
            }
            step = 1;
        } else {
            if (leftBorder < rightBorder) {
                System.out.printf("Ошибка: левая граница (%d) < правой (%d)\n",
                            (int) leftBorder, (int) rightBorder);
                return null;
            }
            step = -1;
        }
        int length = Math.abs(leftBorder - rightBorder) + 1;
        char[] sortedChars = new char[length];
        for (int i = 0; i < length; i++) {
            sortedChars[i] = leftBorder;
            leftBorder += (char) step;
        }
        return sortedChars;
    }

    public static void printTriangle(char[] sortedChars) {
        if (sortedChars == null) {
            return;
        }
        StringBuilder triangle = new StringBuilder();
        int maxWidth = sortedChars.length;
        for (int i = 0; i < sortedChars.length; i++) {
            int spaces = maxWidth - i - 1;
            String line = " ".repeat(spaces) + Character.toString(sortedChars[i])
                        .repeat(2 * i + 1);
            triangle.append(line).append("\n");
        }
        System.out.println(triangle);
    }
}