import java.util.Scanner;
public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Write once, run anywhere тест");
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите имя");
        System.out.println(scanner.nextLine());
    }
}