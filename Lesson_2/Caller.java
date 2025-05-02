public class Caller {
    public static void main(String[] args) {
        Caller.callNonBooleanMethods();
        Caller.callBooleanMethods();
    }

    public static void callBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgramRunning());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.containsUniqueDigit());
        System.out.println(bm.isInputLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmptyImput());
        System.out.println(bm.hasEvenNums());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isFileExist());
    }

    public static void callNonBooleanMethods() {
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
        nonBm.saveDataToUsb();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.getWinnerNfs();
        nonBm.findBookByAuthor();
    }
}