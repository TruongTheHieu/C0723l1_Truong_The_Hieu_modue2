package ss6_module2.he_cac_doi_tuong_hinh_hoc;

public class Circle extends  Shape{
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public String toString() {
        if (filled){
            return "A Shape with color of"+this.color+" and filled";
        }
        return "A Shape with color of"+this.color+" and not filled";
    }
}

