public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setHeight(79.25);
        jaeger1.setSpeed(7);
        System.out.printf("ID %s: %d%n", jaeger1.getModelName(), jaeger1.getId());
        jaeger1.move();
        jaeger1.shoot();
        Jaeger jaeger2 = new Jaeger("Striker Eureka", 76.2, 10);
        System.out.printf("ID %s: %d%n", jaeger2.getModelName(), jaeger2.getId());
        jaeger2.move();
        jaeger2.shoot();
        System.out.printf("Всего произведено: %d шт", Jaeger.getCounter());
    }
}