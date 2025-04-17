import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("ИГРА \"УГАДАЙ ЧИСЛО\"");
        Random random = new Random();
        int targetNum = random.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        int playerGuess = 0;
        while (playerGuess != targetNum) {
            playerGuess = scanner.nextInt();
            if (playerGuess > targetNum) {
                System.out.printf("%d больше того, что загадал компьютер%n", playerGuess);
            } else {
                System.out.printf("%d меньше того, что загадал компьютер%n", playerGuess);
            }
        }
        System.out.println("Вы победили!");
    }
}