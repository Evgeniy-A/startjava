//package com.startjava.lesson_2_3_4.hangman;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class HangmanGame {
//    private static String[] gallows = {
//            "_______",
//            "|     |",
//            "|     @",
//            "|    /|\\",
//            "|    / \\",
//            "| GAME OVER!"
//    };
//    private static int count = gallows.length;
//    private static String[] passWords = {"ПЕТЛЯ", "ВЕРЁВКА", "СТРАЖА", "ВИСИЛИЦА", "ПАЛАЧ"};
//
//    public void Game() {
//        // Инициация слова
//        Random random = new Random();
//        String gameWord = passWords[random.nextInt(5)];
//        // Ввод буквы
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите букву : ");
//        char guessedLetter = scanner.nextLine().charAt(0);
//        System.out.print(guessedLetter);
//        // Процесс поиска буквы в слове
//        if(gameWord.contains(String.valueOf(guessedLetter))) {
//            // Сценарий, что содержит
//            StringBuilder outPut = new StringBuilder();
//            int lengthWord = gameWord.length();
//            for(int i = 0; i < lengthWord; i++) {
//                if (gameWord.charAt(i) == guessedLetter) {
//                    outPut.append(guessedLetter);
//                } else {
//                    outPut.append("*");
//                }
//            }
//            // Сценарий, что не содержит
//        } else {
//            for (int i = count)
//            System.out.println();
//        }
//
//
//    }
//
//
//}
