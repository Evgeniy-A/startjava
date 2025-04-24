public class Calculator {
    public void calculate(int firstNumber, char operator, int secondNumber) {
        System.out.print("Результат: ");
        switch (operator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case '^':
                double result = 1;
                for (int i = 1; i <= Math.abs(secondNumber); i++) {
                    result *= firstNumber;
                }
                if (secondNumber < 0) {
                    result = 1.0 / result;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.printf("Ошибка: операция %c не поддерживается", operator);
        }
    }
}