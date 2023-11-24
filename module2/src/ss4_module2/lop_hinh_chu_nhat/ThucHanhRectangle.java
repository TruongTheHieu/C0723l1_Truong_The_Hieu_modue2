package ss4_module2.lop_hinh_chu_nhat;

public class ThucHanhRectangle {
    public double width,height;

    public ThucHanhRectangle() {
    }
    public ThucHanhRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "ThucHanhRectangle{" + "width=" + width + ", height=" + height + '}';
    }
}

