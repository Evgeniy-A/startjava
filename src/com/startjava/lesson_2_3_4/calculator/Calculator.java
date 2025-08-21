package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

public class Calculator {
    public double calculate(String expression) {
        String[] splitExpression = expression.replaceAll("\\s+", "")
                .split("(?<=\\D)|(?=\\D)");
        int firstNumber = Integer.parseInt(splitExpression[0]);
        int secondNumber = Integer.parseInt(splitExpression[2]);
        String operator = splitExpression[1];
        switch (operator) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на 0!");
                    return Double.NaN;
                }
                return (double) firstNumber / secondNumber;
            }
            case "^" -> {
                return Math.pow(firstNumber, secondNumber);
            }
            case "%" -> {
                if (secondNumber == 0) {
                    System.out.println("Ошибка: попытка деления на 0");
                    return Double.NaN;
                }
                return Math.IEEEremainder(firstNumber, secondNumber);
            }
            default -> {
                System.out.printf("Ошибка: операция %s не поддерживается%n", operator);
                return Double.NaN;
            }
        }
    }
}