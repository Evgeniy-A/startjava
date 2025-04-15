import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("ИГРА \"УГАДАЙ ЧИСЛО\"");
        Random random = new Random( );
        int compNumber = random.nextInt(1,101);
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        while (userGuess != compNumber) {
            if (userGuess > compNumber) {
                System.out.printf("%d больше того, что загадал компьютер%n", userGuess);
            } else {
                System.out.printf("%d меньше того, что загадал компьютер%n", userGuess);
            }
            userGuess = scanner.nextInt();
            continue;
        }
        System.out.println("Вы победили!");
    }
}