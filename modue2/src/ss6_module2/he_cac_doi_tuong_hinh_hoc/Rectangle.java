package ss6_module2.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape{
    public double width = 1.0;
    public  double lenght = 1.0;

    public Rectangle() {
    }
    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return width * this.lenght;
    }
    public  double getPerimeter(){
        return 2 * (width + this.lenght);
    }
}
