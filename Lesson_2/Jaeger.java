public class Jaeger {
    private static int counter = 0;
    private int id;
    private String modelName;
    private double height;
    private int speed;

    public Jaeger() {
        this.id = counter++;
    }

    public Jaeger(String modelName, double height, int speed) {
        this.modelName = modelName;
        this.height = height;
        this.speed = speed;
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.printf("%s is moving%n", modelName);
    }

    public void shoot() {
        System.out.printf("%s is shooting%n", modelName);
    }
}