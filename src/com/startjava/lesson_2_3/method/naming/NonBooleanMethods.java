package com.startjava.lesson_2_3.method.naming;

public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void selectMenu() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageGrade() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    public void printErrorMessage() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> вывести сообщение об ошибке");
    }

    public void syncWithCloudStorage() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreBackup() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownload() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> приостановить загрузку mp3-файла группы \"Ария\"");
    }

    public void resetSettings() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void saveData() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void celsiusToFahrenheit() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void inputMathExpression() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void findWinner() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    public void findBookByAuthor() {
        System.out.println(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> найти книгу по имени писателя\n");
    }
}