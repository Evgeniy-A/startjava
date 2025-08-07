package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Console {
    private Console() {
    }

    // Доп. метод для вывода ошибки в 6.ЗАПОЛНЕНИЕ МАССИВА УНИКАЛЬНЫМИ ЧИСЛАМИ
    public static boolean isArrayConditionsValid(
            int numbersPerLine,
            int length) {
        boolean isValid = true;
        if (numbersPerLine < 1) {
            System.out.printf("Ошибка: количество чисел в строке не должно быть < 1 (%d)\n",
                    numbersPerLine);
            isValid = false;
        }
        if (length == 0) {
            System.out.printf("Ошибка: длина массива должна быть > 0 (%d)\n", length);
            isValid = false;
        }
        return isValid;
    }

    // Доп.метод для вывода ошибки в 5 и 6
    public static boolean isBorderError(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n",
                    (int) leftBorder, (int) rightBorder);
            return true;
        }
        return false;
    }

    // 2. СИМУЛЯЦИЯ “ВЗЛОМА”
    public static void printAccessResult(int accessCode) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        String message = (accessCode > 70 ? ANSI_RED + "Access Granted!" : ANSI_GREEN + "Access Denied!");
        System.out.printf("\rHacking: %s%n%n" + ANSI_RESET, message);
    }

    // 3.ВЫЧИСЛЕНИЕ ФАКТОРИАЛА
    public static void printFactorialExpression(long[] factorials, int... nums) {
        if (factorials == null) {
            System.out.println("Ошибка данных, массив не передан, \"null\"");
            return;
        }
        int length = factorials.length;
        if (length == 0) {
            System.out.println("Передан массив нулевой длины");
            return;
        }
        StringBuilder expression = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) {
                System.out.printf("Ошибка: факториал %d! не определен\n", nums[i]);
                continue;
            }
            for (long j = 1; j <= nums[i]; j++) {
                if (j < nums[i]) {
                    expression.append(j).append(" * ");
                } else {
                    expression.append(j);
                }
            }
            System.out.println(nums[i] + "! = " + ((nums[i]) < 2 ? "1" : expression +
                                                                         " = " + factorials[i]));
        }
    }

    // 4.УДАЛЕНИЕ ЭЛЕМЕНТОВ МАССИВА, ПРЕВЫШАЮЩИХ ЗАДАННОЕ ЗНАЧЕНИЕ
    public static void printFilteredResult(int limitIndex, float[] randomNumbers, float[] filteredNumbers) {
        int length = filteredNumbers.length;
        if (limitIndex < 0 || limitIndex >= length) {
            System.out.printf("\nОшибка, некорректное значение индекса: %d!" +
                              "\nЗначение должно быть в диапазоне [0, 14]\n", limitIndex);
            return;
        }
        if (length == 0) {
            return;
        }
        printNumbers(randomNumbers);
        printNumbers(filteredNumbers);
        System.out.printf("%n%.3f%n", randomNumbers[limitIndex]);
    }

    // вспомогательный метод
    private static void printNumbers(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f ", numbers[i]);
            if (i == 7) {
                System.out.printf("%n");
            }
        }
    }

    // 2.АНИМАЦИЯ ЗАГРУЗКИ
    public static void printHackAnimation() throws InterruptedException {
        char[] spins = {'-', '\\', '|', '/'};
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.print("\rHacking: " + spins[i % 4]);
            Thread.sleep(250);
        }
    }

    // 6.ЗАПОЛНЕНИЕ МАССИВА УНИКАЛЬНЫМИ ЧИСЛАМИ  Может быть проще принимать строку и ее печатать?
    public static void printNumbers(int[] numbers, int numbersPerLine) {
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

    // 1.РЕВЕРС БАНКОВСКИХ ТРАНЗАКЦИЙ
    public static void printTransactionsWithReversed(int[] transactions, int[] reversed) {
        if (reversed == null) {
            System.out.println("Ошибка в данных, информация о транзакциях отсутствует");
            return;
        }
        int length = reversed.length;
        if (length == 0) {
            System.out.println("Пользователь еще не совершал транзакций");
        } else {
            System.out.printf("Исходные транзакции: %s%n", Arrays.toString(transactions));
            System.out.printf(" В обратном порядке: %s%n", Arrays.toString(reversed));
        }
    }

    // 5.ВЫВОД ОТСОРТИРОВАННЫХ СИМВОЛОВ В ВИДЕ ТРЕУГОЛЬНИКА
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
        System.out.println();
        System.out.println(triangle);
    }

    // 7.ВЫВОД ТЕКСТА С ЭФФЕКТОМ ПИШУЩЕЙ МАШИНКИ
    public static void type(String text) throws InterruptedException {
        if (text == null) {
            System.out.println("Ошибка данных - \"null\"");
            return;
        }
        if (text.isBlank()) {
            System.out.println("Ошибка, передана пустая строка");
            return;
        }
        char[] letters = text.toCharArray();
        System.out.println();
        for (char letter : letters) {
            System.out.print(letter);
            Thread.sleep(150);
        }
        System.out.println();
    }
}