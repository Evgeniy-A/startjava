package com.startjava.lesson_2_3_4.method.naming;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        MethodNamesThemeTest.doNonBooleanMethods();
        MethodNamesThemeTest.doBooleanMethods();
    }

    public static void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isRunning());
        System.out.println(bm.isDeleted());
        System.out.println(bm.containsUniqueDigit());
        System.out.println(bm.isEnteredLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmptyInput());
        System.out.println(bm.hasEvenNums());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isAvailable());
    }

    public static void doNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenu();
        nonBm.calculateAverageGrade();
        nonBm.countUniqueWords();
        nonBm.printErrorMessage();
        nonBm.syncWithCloudStorage();
        nonBm.restoreBackup();
        nonBm.pauseDownload();
        nonBm.resetSettings();
        nonBm.saveData();
        nonBm.celsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.findWinner();
        nonBm.findBookByAuthor();
    }
}