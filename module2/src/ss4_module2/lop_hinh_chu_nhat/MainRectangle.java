package ss4_module2.lop_hinh_chu_nhat;

import ss6_module2.he_cac_doi_tuong_hinh_hoc.Rectangle;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a width");
        double width = sc.nextDouble();
        System.out.println("input a height");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Dien tich hinh chu nhat la:" + rectangle.getArea());
        System.out.println("chu vi hinh chu nhat la :" + rectangle.getPerimeter());
    }
}

