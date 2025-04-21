public class Wolf {
    private String gender;
    private String nickname;
    private double weight;
    private int age;
    private String color;

    public Wolf(String gender, String nickname, double weight, int age, String color) {
        this.gender = gender;
        this.nickname = nickname;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}