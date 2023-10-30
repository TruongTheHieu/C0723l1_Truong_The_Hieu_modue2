package ss5_thuchanh_module2;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width, height;

    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
//Định nghĩa các phương thức getArea(), getPerimeter(), display()
    }

    public double getArea() {
        return this.width * this.height;
    }
    public  double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "LopHinhChuNhat{" + "width=" + width + ", height=" + height + "}";
    }
    public class Main {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap chieu rong(width)");
        double width = sc.nextDouble();
        System.out.printf(" Nhap chieu dai (height)");
        double height = sc.nextDouble();
        LopHinhChuNhat rectangle = new LopHinhChuNhat(width, height);
        System.out.println("hinh chu nhat cua ban \n"+ rectangle.display());
        System.out.println("chu vi hinh chu nhat: "+ rectangle.getPerimeter());
        System.out.println("dien tich hinhf chu nhat: "+ rectangle.getArea());
    }
}
 