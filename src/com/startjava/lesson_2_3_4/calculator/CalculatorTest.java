package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
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
            String expression = scanner.nextLine();
            Calculator calculator = new Calculator();
            double result = calculator.calculate(expression);
            printResultCalcExpression(expression, result);
            System.out.println("Продолжим вычисления? [yes / no]");
            answerToQuestion = scanner.nextLine();
        }
    }

    private static void printResultCalcExpression(String expression, double result) {
        if (!Double.isNaN(result)) {
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.printf("%s = %s%n", expression, df.format(result));
        }
    }
}