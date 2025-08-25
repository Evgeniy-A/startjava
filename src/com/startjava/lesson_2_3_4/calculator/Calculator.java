package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final int EXPRESSION_LENGTH = 3;

    public static double calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        if (splitExpression.length != EXPRESSION_LENGTH) {
            throw new IllegalArgumentException("Ошибка: выражение должно состоять из трёх аргументов");
        }
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
                }
                yield Math.IEEEremainder(firstNumber, secondNumber);
            }
            case "^" -> Math.pow(firstNumber, secondNumber);
            default -> throw new IllegalArgumentException(
                    String.format("Ошибка, операция '%s' не поддерживается", operator));
        };
    }
}