package com.startjava.lesson_2_3_4.array;

public class TypewriterPrinter {
    public static void main(String[] args) throws InterruptedException {
        printWithTypewriterEffect(transformTextByWordLength("Java - это C++, " +
                "из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling"));
        printWithTypewriterEffect(transformTextByWordLength("Чтобы написать чистый код, " +
                 "мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin"));
        printWithTypewriterEffect(transformTextByWordLength(null));
        printWithTypewriterEffect(transformTextByWordLength(""));
    }

    private static String transformTextByWordLength(String input) {
        if (input == null) {
            return null;
        }
        if (input.isBlank()) {
            return "";
        }
        String[] inputWords = input.split("[\\s]+");
        int length = inputWords.length;
        int maxWordIndex = -1;
        int minWordIndex = -1;
        int maxWordLength = Integer.MIN_VALUE;
        int minWordLength = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (inputWords[i].matches("[\\p{Punct}]+")) {
                continue;
            }
            if (maxWordLength < inputWords[i].length()) {
                maxWordLength = inputWords[i].length();
                maxWordIndex = i;
            }
            if (minWordLength > inputWords[i].length()) {
                minWordLength = inputWords[i].length();
                minWordIndex = i;
            }
        }
        int startUpperCaseIndex = Math.min(maxWordIndex, minWordIndex);
        int endUpperCaseIndex = Math.max(maxWordIndex, minWordIndex);
        StringBuilder resultLine = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != length - 1 && inputWords[i].contains("-") && inputWords[i + 1].matches(".*[A-Z].*")) {
                resultLine.append('\n').append(inputWords[i]).append(" ");
                continue;
            }
            if (i >= startUpperCaseIndex && i <= endUpperCaseIndex) {
                resultLine.append(inputWords[i].toUpperCase()).append(" ");
                continue;
            }
            resultLine.append(inputWords[i]).append(" ");
        }
        return resultLine.toString().trim();
    }

    private static void printWithTypewriterEffect(String text) throws InterruptedException {
        if (text == null) {
            System.out.println("Ошибка данных - \"null\"");
            return;
        }
        if (text.isBlank()) {
            System.out.println("Ошибка, передана пустая строка");
            return;
        }
        char[] letters = text.toCharArray();
        for (char letter : letters) {
            System.out.print(letter);
            Thread.sleep(150);
        }
        System.out.println();
    }
}