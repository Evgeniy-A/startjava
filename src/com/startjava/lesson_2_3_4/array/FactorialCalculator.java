package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        var nums = new int[0];
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = null;
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{8, 0, 9};
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{-3, 1, 7, 13};
        printFactorialExpression(calculateFactorial(nums), nums);
        nums = new int[]{-22, -0};
        printFactorialExpression(calculateFactorial(nums), nums);
    }

    private static long[] calculateFactorial(int... nums) {
        if (nums == null) {
            return null;
        }
        int length = nums.length;
        if (length == 0) {
            return new long[0];
        }
        long[] factorials = new long[length];
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            long result = 1;
            for (int j = 1; j <= nums[i]; j++) {
                result *= j;
            }
            factorials[i] = result;
        }
        return factorials;
    }

    private static void printFactorialExpression(long[] factorials, int... nums) {
        if (nums == null) {
            System.out.println("null\n");
            return;
        }
        int length = nums.length;
        if (length == 0) {
            System.out.println("массив нулевой длины\n");
            return;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) {
                System.out.printf("Ошибка: факториал %d! не определен\n", nums[i]);
                continue;
            }
            StringBuilder expression = new StringBuilder();
            System.out.println(
                    (nums[i] == 0 || nums[i] == 1) ?
                            expression.append(nums[i]).append("! = 1")
                            : expression.append(nums[i]).append("! = ")
                            .append(formatExpression(nums[i])).append(" = ")
                            .append(factorials[i]));
        }
        System.out.println();
    }

    private static String formatExpression(int num) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            expression.append(i);
            if (i < num) {
                expression.append(" * ");
            }
        }
        return expression.toString();
    }
}