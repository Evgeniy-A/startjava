package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Введите первое число: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operator = calculator.operatorChecking(scanner);
                System.out.print("Введите второе число: ");
                int secondNumber = scanner.nextInt();
                calculator.calculate(firstNumber, operator, secondNumber);
                scanner.nextLine();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine().trim();
        } while (!answer.equalsIgnoreCase("no"));
    }
}