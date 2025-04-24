import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);
        GuessNumber guessNumber = new GuessNumber();
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            guessNumber.guessingNumber(player1, player2, scanner);
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
        }
    }
}