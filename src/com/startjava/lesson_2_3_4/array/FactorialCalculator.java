package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        var arguments = new int[0];
        printFactorialExpression(factorialCalculator(arguments), arguments);
        arguments = null;
        printFactorialExpression(factorialCalculator(arguments), arguments);
        arguments = new int[]{8, 0, 9};
        printFactorialExpression(factorialCalculator(arguments), arguments);
        arguments = new int[]{-3, 1, 7, 13};
        printFactorialExpression(factorialCalculator(arguments), arguments);
        arguments = new int[]{-22, -0};
        printFactorialExpression(factorialCalculator(arguments), arguments);
    }

    private static long[] factorialCalculator(int... factorialArgs) {
        if (factorialArgs == null) {
            return null;
        }
        int length = factorialArgs.length;
        if (length == 0) {
            return new long[0];
        }
        long[] factorials = new long[length];
        for (int i = 0; i < length; i++) {
            if (factorialArgs[i] < 0) {
                continue;
            }
            long result = 1;
            for (int j = 1; j <= factorialArgs[i]; j++) {
                result *= j;
            }
            factorials[i] = result;
        }
        return factorials;
    }

    private static void printFactorialExpression(long[] factorials, int... factorialArgs) {
        if (factorialArgs == null) {
            System.out.println("null\n");
            return;
        }
        int length = factorialArgs.length;
        if (length == 0) {
            System.out.println("массив нулевой длины\n");
            return;
        }
        for (int i = 0; i < length; i++) {
            if (factorialArgs[i] < 0) {
                System.out.printf("Ошибка: факториал %d! не определен\n", factorialArgs[i]);
                continue;
            }
            System.out.println(
                    (factorialArgs[i] == 0 || factorialArgs[i] == 1) ?
                            factorialArgs[i] + "! = 1"
                            : factorialArgs[i] + "! = " + formatExpression(factorialArgs[i]) +
                            " = " + factorials[i]);
        }
        System.out.println();
    }

    private static String formatExpression(int factorialArg) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= factorialArg; i++) {
            expression.append(i);
            if (i < factorialArg) {
                expression.append(" * ");
            }
        }
        return expression.toString();
    }
}