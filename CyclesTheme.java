public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int startNumber = -10;
        int endNumber = 21;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int count = startNumber;
        do {
            if (count % 2 == 0) {
                sumOfEvenNumbers += count;
            } else {
                sumOfOddNumbers += count;
            }
            count++;
        } while (count <= endNumber);
        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                startNumber, endNumber, sumOfEvenNumbers, sumOfOddNumbers);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int tmp = 0;
        if (firstNumber < secondNumber) {
            tmp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        if (firstNumber < thirdNumber) {
            tmp = thirdNumber;
            thirdNumber = firstNumber;
            firstNumber = tmp;
        }
        if (secondNumber < thirdNumber) {
            tmp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = tmp;
        }
        for (int i = thirdNumber + 1; i < firstNumber; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        int number = 1234;
        int sumNumber = 0;
        while (number != 0) {
            tmp = tmp * 10 + (number % 10);
            sumNumber += tmp;
            number /= 10;
        }
        System.out.print(tmp);
        System.out.println("\n" + sumNumber);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        count = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        int zeroCount = count % 5;
        if (zeroCount != 0) {
            for (int i = 0; i < 5 - zeroCount; i++) {
                System.out.printf("%3d", 0);
            }
            System.out.println();
        }

        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        number = 3242592;
        tmp = number;
        count = 0;
        while (tmp != 0) {
            if (tmp % 10 == 2) {
                count++;
            }
            tmp /= 10;
        }
        if (count % 2 == 0) {
            System.out.printf("В %d четное (%d) количество двоек%n", number, count);
        } else {
            System.out.printf("В %d нечетное (%d) количество двоек%n", number, count);
        }

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int width = 0;
        int height = 5;
        while (height >= width) {
            count = 0;
            while (count < height - width) {
                System.out.print('#');
                count++;
            }
            System.out.println();
            width++;
        }

        height = 5;
        int line = 1;
        do {
            if (line <= 3) {
                width = line;
            } else {
                width = height - line + 1;
            }
            count = 1;
            do {
                System.out.print("$");
                count++;
            } while (count <= width);
            System.out.println();
            line++;
        } while (line <= height);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.println("DECIMAL CHARACTER DESCRIPTION");
        for (char i = 33; i < 48; i += 2) {
            System.out.printf("  %-3d       %c          %-20s%n",
                    (int) i, i, Character.getName(i));
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {
                System.out.printf("  %-3d       %c          %-20s%n",
                        (int) i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        number = 123321;
        tmp = number;
        int reversedNumber = 0;
        while (tmp != 0) {
            reversedNumber *= 10;
            reversedNumber += tmp % 10;
            tmp /= 10;
        }
        System.out.println(reversedNumber);
        if (number == reversedNumber) {
            System.out.printf("Число %d - палиндром", number);
        } else {
            System.out.printf("Число %d - число не является палиндромом", number);
        }

        System.out.println("\n\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        int firstHalfNumber = number / 1000;
        int sumOfFirstHalf = 0;
        int secondHalfNumber = number % 1000;
        int sumOfSecondHalf = 0;
        for (int i = 0; i < 3; i++) {
            sumOfFirstHalf += firstHalfNumber % 10;
            firstHalfNumber /= 10;
            sumOfSecondHalf += secondHalfNumber % 10;
            secondHalfNumber /= 10;
        }
        if (sumOfFirstHalf == sumOfSecondHalf) {
            System.out.printf("Число %d - счастливое%n", number);
            System.out.printf("сумма цифр %d = %d%n", (number / 1000), sumOfFirstHalf);
            System.out.printf("сумма цифр %d = %d%n", (number % 1000), sumOfSecondHalf);
        }

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");
        System.out.print("  |");
        for (int j = 2; j < 10; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();
        System.out.println("--+------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }
}