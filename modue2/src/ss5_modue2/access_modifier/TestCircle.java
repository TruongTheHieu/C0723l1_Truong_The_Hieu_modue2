package ss5_modue2.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle  circle = new Circle(3);
        System.out.println("this radius :" + circle.getRadius());
        System.out.println("this area : " + circle.getArea());
    }
}
