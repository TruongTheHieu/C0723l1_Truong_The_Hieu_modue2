package ss6_module2.he_cac_doi_tuong_hinh_hoc;

public class Shape {
public  String color;
public  boolean filled ;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        if (filled){
            return "A Shape with color of"+this.color+" and filled";
        }
        return "A Shape with color of"+this.color+" and not filled";
    }
}
