package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    private static final int EXPRESSION_LENGTH = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerToQuestion = "yes";
        while (!answerToQuestion.equals("no")) {
            if (!answerToQuestion.equals("yes")) {
                System.out.println("Введите корректный ответ [yes / no]: ");
                answerToQuestion = scanner.nextLine();
                continue;
            }
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10: ");
            String expression = cleanExpression(scanner.nextLine());
            double result;
            try {
                result = Calculator.calculate(expression);
                printResultCalcExpression(expression, result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Продолжим вычисления? [yes / no]");
            answerToQuestion = scanner.nextLine();
        }
    }

    private static String cleanExpression(String expression) {
        String[] splitExpression = expression.split(" ");
        if (splitExpression.length != EXPRESSION_LENGTH) {
            StringBuilder str = new StringBuilder();
            for (String exp : splitExpression) {
                if (!exp.isBlank()) {
                    str.append(exp).append(" ");
                }
            }
            return str.toString().trim();
        }
        return expression.trim();
    }

    private static void printResultCalcExpression(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.printf("%s = %s%n", expression, df.format(result));
    }
}