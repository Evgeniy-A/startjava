import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        String supportedOperators = "+-*/^%";
        do {
            final int firstNumber;
            if (answer.equals("yes")) {
                System.out.print("Введите первое число: ");
                firstNumber = scanner.nextInt();
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operator = scanner.next().charAt(0);
                while (!supportedOperators.contains(String.valueOf(operator))) {
                    System.out.printf("Ошибка: операция '%c' не поддерживается%n" +
                            "Введите знак операции (+, -, *, /, ^, %%): ", operator);
                    operator = scanner.next().charAt(0);
                }
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