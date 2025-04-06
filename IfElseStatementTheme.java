import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }
        int age = 19;
        if (age > 18) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Человек несовершеннолетний");
        }
        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Человек среднего роста");
        } else {
            System.out.println("Человек высокий");
        }
        char firstLetterOfName = "Albina".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается с буква I");
        } else {
            System.out.println("Имя не начинается ни с буквы I ни с буквы M");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА");
        int firstNumber = 1;
        int secondNumber = 2;
        if (firstNumber > secondNumber) {
            System.out.printf("Число %d больше числа %d", firstNumber, secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.printf("Число %d больше числа %d", secondNumber, firstNumber);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. ПРОВЕРКА ЧИСЛА");
        int number = 2;
        if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (number % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (number > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ");
        int firstValue = 123;
        int secondValue = 223;
        if (firstValue / 100 != secondValue / 100 &&
                (firstValue / 10) % 10 != (secondValue / 10) % 10 &&
                firstValue % 10 != secondValue % 10) {
            System.out.println("Равных цифр в числах нет");
        } else {
            System.out.println(firstValue + " и " + secondValue);
            if (firstValue / 100 == secondValue / 100) {
                System.out.printf("Сотни равны между собой - %d\n", firstValue / 100);
            }
            if ((firstValue / 10) % 10 == (secondValue / 10) % 10) {
                System.out.printf("Десятки равны между собой - %d\n", (firstValue / 10) % 10);
            }
            if (firstValue % 10 == secondValue % 10) {
                System.out.printf("Единицы равны между собой - %d\n", firstValue % 10);
            }
        }

        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ");
        char valueChar = '\u0057';
        if (Character.isLetter(valueChar)) {
            if (Character.isUpperCase(valueChar)) {
                System.out.printf("'%c' - большая буква\n", valueChar);
            } else {
                System.out.printf("'%c' - маленькая буква\n", valueChar);
            }
        } else if (Character.isDigit(valueChar)) {
            System.out.printf("'%c' - цифра\n", valueChar);
        } else {
            System.out.printf("'%c' - ни буква и ни цифра\n", valueChar);
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        double amount = 321123.59;
        double interestAmount;
        if (amount < 100000) {
            interestAmount = amount * 0.05;
        } else if (amount <= 300000) {
            interestAmount = amount * 0.07;
        } else {
            interestAmount = amount * 0.1;
        }
        System.out.printf("Сумма вклада - %,.2f%nCумма начисленного %% - %,.2f%n" +
                "Итоговая сумму с %% -%,.2f%n", amount, interestAmount, amount + interestAmount);

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercentage = 59;
        int historyScore;
        int programmingPercentage = 92;
        int programmingScore;
        if (historyPercentage <= 60) {
            historyScore = 2;
        } else if (historyPercentage <= 73) {
            historyScore = 3;
        } else if (historyPercentage <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        if (programmingPercentage <= 60) {
            programmingScore = 2;
        } else if (programmingPercentage <= 73) {
            programmingScore = 3;
        } else if (programmingPercentage <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        System.out.printf("История - %d%nПрограммирование - %d%n", historyScore, programmingScore);
        System.out.printf("Средний балл оценок по предметам - %f%n",
                (double) (historyScore + programmingScore) / 2);
        System.out.printf("средний %% по предметам - %f%n",
                (double) (historyPercentage + programmingPercentage) / 2);

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        double sales = 13025.233;
        double rent = 5123.018;
        double costOfProduction = 9001.729;
        double annualProfit = 12 * (sales - rent - costOfProduction);
        if (annualProfit > 0) {
            System.out.printf("Прибыль за год: + %,.2f руб.%n", annualProfit);
        } else if (annualProfit < 0) {
            System.out.printf("Прибыль за год: %,.2f руб.%n", annualProfit);
        } else {
            System.out.println("Прибыль за год 0 руб.");
        }

        System.out.println("\n9.*РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        var salesBigD = new BigDecimal("13025.233");
        var rentBigD = new BigDecimal("5123.018");
        var costOfProductionBigD = new BigDecimal("9001.729");
        var annualProfitBigD = new BigDecimal(12).multiply(salesBigD.subtract(rentBigD)
                .subtract(costOfProductionBigD));
        if (annualProfitBigD.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: + %,.2f руб.%n", annualProfit);
        } else if (annualProfitBigD.compareTo(BigDecimal.ZERO) < 0) {
            System.out.printf("Прибыль за год: %,.2f руб.%n", annualProfit);
        } else {
            System.out.println("Прибыль за год 0 руб.");
        }

        System.out.println("\n10.*ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        var amountBigD = new BigDecimal("321123.59");
        var interestAmountBigD = BigDecimal.ZERO;
        if (amountBigD.compareTo(new BigDecimal("100000")) < 0) {
            interestAmountBigD = amountBigD.multiply(new BigDecimal("0.05"));
        } else if (amountBigD.compareTo(new BigDecimal("300000")) <= 0) {
            interestAmountBigD = amountBigD.multiply(new BigDecimal("0.07"));
        } else {
            interestAmountBigD = amountBigD.multiply(new BigDecimal("0.1"));
        }
        System.out.printf("Сумма вклада - %,.2f%nCумма начисленного %% - %,.2f%n" +
                "Итоговая сумму с %% - %,.2f%n",
                amountBigD, interestAmountBigD, amountBigD.add(interestAmountBigD));
    }
}