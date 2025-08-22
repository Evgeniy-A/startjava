package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int firstNumber;
        int secondNumber;
        try {
            firstNumber = Integer.parseInt(splitExpression[0]);
            secondNumber = Integer.parseInt(splitExpression[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: введено не целое число");
        }

        String operator = splitExpression[1];
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/", "%" -> {
                if (secondNumber == 0) {
                    throw new ArithmeticException("Ошибка: деление на 0!");
                }
                if (operator.equals("/")) {
                    yield (double) firstNumber / secondNumber;
                } else {
                    yield Math.IEEEremainder(firstNumber, secondNumber);
                }
            }
            case "^" -> Math.pow(firstNumber, secondNumber);
            default -> {
                throw new IllegalArgumentException(String
                        .format("Ошибка, знак не поддерживается для выражений вида: %s", expression));
            }
        };
    }
}