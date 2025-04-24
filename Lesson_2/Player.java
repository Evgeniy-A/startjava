import java.util.Scanner;

public class Player {
    private String name;

    public Player(Scanner scanner) {
        System.out.print("Введите имя игрока: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    } 
}
