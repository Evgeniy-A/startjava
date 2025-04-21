public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf("мужской", "волчок", 35, 5, "серый");
        System.out.println(wolf1.getGender());
        System.out.println(wolf1.getNickname());
        System.out.println(wolf1.getWeight());
        System.out.println(wolf1.getAge());
        System.out.println(wolf1.getColor());
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}