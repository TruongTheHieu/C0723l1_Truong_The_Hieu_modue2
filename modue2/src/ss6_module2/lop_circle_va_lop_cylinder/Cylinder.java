package ss6_module2.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double darius, String color, double height) {
        super(darius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumi(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Radius : " + this.getRadius() + " || color: " + this.getColor() +" || H : " + this.getHeight();
    }
}
