import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА");

        // количество ядер процессора
        byte cpuCores = 0;
        System.out.println("количество ядер процессора = " + cpuCores);

        // оперативная память
        short ramSizeGb = 16;
        System.out.println("оперативная память = " + ramSizeGb);

        // объем диска
        int diskSpaceGb = 0;
        System.out.println("объем диска = " + diskSpaceGb);

        // общее количество файлов в системе
        long totalFiles = 1500000L;
        System.out.println("общее количество файлов в системе = " + totalFiles);

        // частота процессора
        float cpuFrequencyGhz = 3.6f;
        System.out.println("частота процессора = " + cpuFrequencyGhz);

        // объем видеопамяти
        double gpuMemoryGb = 4.0;
        System.out.println("объем видеопамяти = " + gpuMemoryGb);

        // наличие wi-fi
        boolean hasWiFi = true;
        System.out.println("наличие wi-fi = " + hasWiFi);

        // тип диска
        char diskType = 'S';
        System.out.println("тип диска = " + diskType);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        double priceOfPen = 105.5;
        double priceOfBook = 235.83;
        double salePercentage = 0.11;

        // стоимость товаров без скидки
        double sumPrice = priceOfPen + priceOfBook;
        System.out.printf("стоимость товаров без скидки = %.1f%n", sumPrice);

        // сумма скидки
        double discountRubles = sumPrice * salePercentage;
        System.out.printf("сумма скидки = %.1f%n", discountRubles);

        // стоимость товаров со скидкой
        double finalPrice = sumPrice - discountRubles;
        System.out.printf("стоимость товаров со скидкой = %.1f%n", finalPrice);

        System.out.println("\n3. ВЫВОД СЛОВА JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        char maxChar = 65535;

        // первоначальное значение
        System.out.println(maxByte);
        // значение после инкремента на единицу
        System.out.println(++maxByte);
        // значение после декремента на единицу
        System.out.println(--maxByte + "\n");

        // первоначальное значение
        System.out.println(maxShort);
        // значение после инкремента на единицу
        System.out.println(++maxShort);
        // значение после декремента на единицу
        System.out.println(--maxShort + "\n");

        // первоначальное значение
        System.out.println(maxInt);
        // значение после инкремента на единицу
        System.out.println(++maxInt);
        // значение после декремента на единицу
        System.out.println(--maxInt + "\n");

        // первоначальное значение
        System.out.println(maxLong);
        // значение после инкремента на единицу
        System.out.println(++maxLong);
        // значение после декремента на единицу
        System.out.println(--maxLong + "\n");

        // первоначальное значение
        System.out.println(maxLong);
        // значение после инкремента на единицу
        System.out.println(++maxLong);
        // значение после декремента на единицу
        System.out.println(--maxLong + "\n");

        // первоначальное значение
        System.out.println(maxChar);
        // значение после инкремента на единицу
        System.out.println(++maxChar);
        // значение после декремента на единицу
        System.out.println(--maxChar);

        System.out.println("\n5. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");
        int firstNumber = 2;
        int secondNumber = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        int thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        System.out.println("\nПерестановка с помощью арифметических операций");
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);
        System.out.println("\nПерестановка с помощью побитовой операции ^");
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber ^= secondNumber;
        System.out.println("Первое значение = " + firstNumber);
        System.out.println("Второе значение = " + secondNumber);

        System.out.println("\n6. ВЫВОД СИМВОЛОВ И ИХ КОДОВ");
        char dollarSymbol = '$';
        char starSymbol = '*';
        char dogSymbol = '@';
        char exponentSymbol = '^';
        char tildaSymbol = '~';
        System.out.println(dollarSymbol + " " + (int) dollarSymbol);
        System.out.println(starSymbol + " " + (int) starSymbol);
        System.out.println(dogSymbol + " " + (int) dogSymbol);
        System.out.println(exponentSymbol + " " + (int) exponentSymbol);
        System.out.println(tildaSymbol + " " + (int) tildaSymbol);

        System.out.println("\n7 ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");
        char slashSymbol = '/';
        char backslashSymbol = '\\';
        char underscoreSymbol = '_';
        char leftParenthesisSymbol = '(';
        char rightParenthesisSymbol = ')';
        System.out.println("    " + slashSymbol + backslashSymbol +
                "\n   " + slashSymbol + "  " + backslashSymbol +
                "\n  " + slashSymbol + underscoreSymbol +
                leftParenthesisSymbol + " " + rightParenthesisSymbol +
                backslashSymbol + "\n " + slashSymbol + "      " +
                backslashSymbol + "\n" + slashSymbol +
                underscoreSymbol + underscoreSymbol +
                underscoreSymbol + underscoreSymbol +
                slashSymbol + backslashSymbol + 
                underscoreSymbol + underscoreSymbol + backslashSymbol);

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
        int hours = timeSec / 3600;
        int minutes = timeSec % 3600 / 60;
        int seconds = timeSec % 3600 % 60;
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        System.out.println("\n10. *РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        var priceOfPenBigD = new BigDecimal("105.50");
        var priceOfBookBigD = new BigDecimal("235.83");
        var salePercentageBigD = new BigDecimal("0.11");

        // стоимость товаров без скидки
        var sumPriceBigD = priceOfPenBigD.add(priceOfBookBigD);
        System.out.println("стоимость товаров без скидки = " + sumPriceBigD);

        // сумма скидки
        var discountRublesBigD = sumPriceBigD.multiply(salePercentageBigD)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("сумма скидки = " + discountRublesBigD);

        // стоимость товаров со скидкой
        var finalPriceBigD = sumPriceBigD.subtract(discountRublesBigD);
        System.out.println("стоимость товаров со скидкой =" + finalPriceBigD);
    }
}