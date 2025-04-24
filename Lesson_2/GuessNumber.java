import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void guessingNumber(Player player1, Player player2, Scanner scanner) {
        Random random = new Random();
        int targetNum = random.nextInt(1, 101);
        int playerGuess = 0;
        boolean isPlayer = false;
        while (playerGuess != targetNum) {
            isPlayer = !isPlayer;
            if (isPlayer) {
                System.out.printf("%s ввел число: ", player1.getName());
            } else {
                System.out.printf("%s ввел число: ", player2.getName());
            }
            playerGuess = scanner.nextInt();
            if (playerGuess > targetNum) {
                System.out.printf("%d больше того, что загадал компьютер%n", playerGuess);
            } else if (playerGuess < targetNum) {
                System.out.printf("%d меньше того, что загадал компьютер%n", playerGuess);
            } else {
                System.out.printf("Победил игрок : %s%n",
                            isPlayer ? player1.getName() : player2.getName());
                break;
            }
        }
    }
}