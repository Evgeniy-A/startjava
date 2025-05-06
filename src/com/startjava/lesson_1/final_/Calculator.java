package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public void calculate(int firstNumber, char operator, int secondNumber) {
        double result = 1;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    break;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case '^':
                for (int i = 1; i <= Math.abs(secondNumber); i++) {
                    result *= firstNumber;
                }
                result = (secondNumber < 0) ? 1.0 / result : result;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.printf("Ошибка: операция %c не поддерживается", operator);
        }
        if (operator == '^' && secondNumber < 0) {
            System.out.printf("Результат: %.4f%n", result);
        } else if (operator == '/' && secondNumber == 0) {
            System.out.println("Ошибка: деление на ноль запрещено");
        } else {
            System.out.printf("Результат: %.0f%n", result);
        }
    }

    public char operatorChecking(Scanner scanner) {
        String supportedOperators = "+-*/^%";
        char operator = scanner.next().charAt(0);
        while (!supportedOperators.contains(String.valueOf(operator))) {
            System.out.printf("Ошибка: операция '%c' не поддерживается%n" +
                    "Введите знак операции (+, -, *, /, ^, %%): ", operator);
            operator = scanner.next().charAt(0);
        }
        return operator;
    }
}