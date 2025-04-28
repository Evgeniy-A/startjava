import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        game.player1 = new Player(name1);
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        game.player2 = new Player(name2);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                game.play(scanner);
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine().trim();
        } while (!answer.equalsIgnoreCase("no"));
    }
}