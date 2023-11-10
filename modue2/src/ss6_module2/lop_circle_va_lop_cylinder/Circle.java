package ss6_module2.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double darius, String color) {
        this.radius = darius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI *radius*radius;
    }

    @Override
    public String toString() {
        return "Radius : " + this.getRadius() + " || color :" +this.getColor();
    }
}

