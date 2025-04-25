import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            String supportedOperators = "+-*/^%";
            char operator = 'o';
            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            operator = scanner.next().charAt(0);
            while (!supportedOperators.contains(String.valueOf(operator))) {
                System.out.printf("Ошибка: операция '%c' не поддерживается%n" +
                        "Введите знак операции (+, -, *, /, ^, %%): ", operator);
                operator = scanner.next().charAt(0);
            }
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();
            calculator.calculate(firstNumber, operator, secondNumber);
            String answer = "";
            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
