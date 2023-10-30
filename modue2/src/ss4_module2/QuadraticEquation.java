package ss4_module2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = b*b - 4 *a*c;
        return delta;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(b*b - 4 *a*c))/2 *a;
    }
    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

}