package com.startjava.lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean isRunning() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean isDeleted() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> удалился ли файл на жестком диске или флешке? ");
        return true;
    }

    public boolean containsUniqueDigit() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isEnteredLetter() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean hasAttempts() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptyInput() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean hasEvenNums() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isAvailable() {
        System.out.print(CurrentMethodNameUtil.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}