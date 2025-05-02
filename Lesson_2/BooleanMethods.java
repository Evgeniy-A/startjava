public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> удалился ли файл на жестком диске или флешке? ");
        return true;
    }

    public boolean containsUniqueDigit() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isInputLetter() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean hasAttempts() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptyImput() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean hasEvenNums() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isFileExist() {
        System.out.print(Util.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}