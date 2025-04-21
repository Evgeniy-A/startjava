import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int secondNumber = scanner.nextInt();
        int result = 1;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        } else if (operator == '^') {
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (operator == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.printf("%d %c %d = %d",
                    firstNumber, operator, secondNumber, result);
    }
}