package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] splitExpression = expression.replaceAll("\\s+", "")
                .split("(?<=\\D)|(?=\\D)");
        int firstNumber = Integer.parseInt(splitExpression[0]);
        int secondNumber = Integer.parseInt(splitExpression[2]);
        String operator = splitExpression[1];
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/", "%" -> {
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на 0!");
                    yield Double.NaN;
                }
                if (operator.equals("/")) {
                    yield (double) firstNumber / secondNumber;
                } else {
                    yield Math.IEEEremainder(firstNumber, secondNumber);
                }
            }
            case "^" -> Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.printf("Ошибка: операция %s не поддерживается%n", operator);
                yield Double.NaN;
            }
        };
    }
}