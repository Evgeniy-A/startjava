import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            String allOperators = "+-*/^%";
            char operator;
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                operator = scanner.next().charAt(0);
                if (!allOperators.contains(String.valueOf(operator))) {
                    System.out.printf("Ошибка: операция '%c' не поддерживается%n", operator);
                }
            } while (!allOperators.contains(String.valueOf(operator)));
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            calculator.calculate(firstNumber, operator, secondNumber);
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
        }
    }
}