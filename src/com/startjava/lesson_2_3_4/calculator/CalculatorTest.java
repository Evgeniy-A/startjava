package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answerToQuestion = "yes";
        while (!answerToQuestion.equals("no")) {
            if (answerToQuestion.equals("yes")) {
                System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10: ");
                String expression = removeDuplicateSpaces(scanner.nextLine());
                try {
                    double result = Calculator.calculate(expression);
                    printResultCalcExpression(expression, result);
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Продолжим вычисления? [yes / no]");
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
            answerToQuestion = scanner.nextLine();
        }
    }

    private static String removeDuplicateSpaces(String expression) {
        return expression.replaceAll("\\s+", " ").trim();
    }

    private static void printResultCalcExpression(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.printf("%s = %s%n", expression, df.format(result));
    }
}