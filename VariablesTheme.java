import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");
        byte cpuCores = 0;
        System.out.println("количество ядер процессора = " + cpuCores);
        short ramSizeGb = 16;
        System.out.println("оперативная память = " + ramSizeGb);
        int diskSpaceGb = 0;
        System.out.println("объем диска = " + diskSpaceGb);
        long totalFiles = 1500000L;
        System.out.println("общее количество файлов в системе = " + totalFiles);
        float cpuFrequencyGhz = 3.6f;
        System.out.println("частота процессора = " + cpuFrequencyGhz);
        double gpuMemoryGb = 4.0;
        System.out.println("объем видеопамяти = " + gpuMemoryGb);
        boolean hasWiFi = true;
        System.out.println("наличие wi-fi = " + hasWiFi);
        char diskType = 'S';
        System.out.println("тип диска = " + diskType);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        double priceOfPen = 105.5;
        double priceOfBook = 235.83;
        double discount = 0.11;

        // стоимость товаров без скидки
        double basePrice = priceOfPen + priceOfBook;
        System.out.printf("стоимость товаров без скидки = %.1f%n", basePrice);

        // сумма скидки
        double discountPrice = basePrice * discount;
        System.out.printf("сумма скидки = %.1f%n", discountPrice);

        // стоимость товаров со скидкой
        double finalPrice = basePrice - discountPrice;
        System.out.printf("стоимость товаров со скидкой = %.1f%n", finalPrice);

        System.out.println("\n3. ВЫВОД СЛОВА JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        byte maxByte = 127;
        System.out.println("byte \n" + maxByte + "\n" + ++maxByte + "\n" + --maxByte + "\n");
        short maxShort = 32767;
        System.out.println("short \n" + maxShort + "\n" + ++maxShort + "\n" + --maxShort + "\n");
        int maxInt = 2147483647;
        System.out.println("int \n" + maxInt + "\n" + ++maxInt + "\n" + --maxInt + "\n");
        long maxLong = 9223372036854775807L;
        System.out.println("long \n" + maxLong + "\n" + ++maxLong + "\n" + --maxLong + "\n");
        char maxChar = 65535;
        System.out.println("char \n" + (int) maxChar + "\n" + (int) ++maxChar + "\n" +
                (int) --maxChar);

        System.out.println("\n5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int firstNumber = 2;
        int secondNumber = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        int tmp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tmp;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        System.out.println("\nПерестановка с помощью арифметических операций");
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        System.out.println("\nПерестановка с помощью побитовой операции ^");
        firstNumber ^= secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber ^= secondNumber;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);

        System.out.println("\n6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char dollar = '$';
        char star = '*';
        char dog = '@';
        char caret = '^';
        char tilde = '~';
        System.out.println(dollar + " " + (int) dollar);
        System.out.println(star + " " + (int) star);
        System.out.println(dog + " " + (int) dog);
        System.out.println(caret + " " + (int) caret);
        System.out.println(tilde + " " + (int) tilde);

        System.out.println("\n7 ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash +
                "\n   " + slash + "  " + backslash +
                "\n  " + slash + underscore +
                leftParenthesis + " " + rightParenthesis +
                backslash + "\n " + slash + "      " +
                backslash + "\n" + slash +
                underscore + underscore +
                underscore + underscore +
                slash + backslash + 
                underscore + underscore + backslash);

        System.out.println("\n8. МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.printf("Число %d содержит:%n", number);
        System.out.printf("  сотен - %d%n", hundreds);
        System.out.printf("  десятков - %d%n", tens);
        System.out.printf("  единиц - %d%n", ones);
        System.out.printf("Сумма разрядов = %d%n", sum);
        System.out.printf("Произведение разрядов = %d%n", product);

        System.out.println("\n9. ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ");
        int timeSec = 86399;
        int hh = timeSec / 3600;
        int mm = timeSec / 60 % 60;
        int ss = timeSec % 60;
        System.out.printf("%d:%d:%d%n", hh, mm, ss);

        System.out.println("\n10. *РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        var priceOfPenBigD = new BigDecimal("105.50");
        var priceOfBookBigD = new BigDecimal("235.83");
        var discountBigD = new BigDecimal("0.11");

        // стоимость товаров без скидки
        var basePriceBigD = priceOfPenBigD.add(priceOfBookBigD);
        System.out.println("стоимость товаров без скидки = " + basePriceBigD);

        // сумма скидки
        var discountPriceBigD = basePriceBigD.multiply(discountBigD)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("сумма скидки = " + discountPriceBigD);

        // стоимость товаров со скидкой
        var finalPriceBigD = basePriceBigD.subtract(discountPriceBigD);
        System.out.println("стоимость товаров со скидкой =" + finalPriceBigD);
    }
}