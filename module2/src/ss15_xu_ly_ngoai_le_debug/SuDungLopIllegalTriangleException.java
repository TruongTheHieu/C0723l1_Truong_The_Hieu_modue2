package ss15_xu_ly_ngoai_le_debug;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    private double canh1, canh2, canh3;

    public SuDungLopIllegalTriangleException(double canh1, double canh2, double canh3) throws IllegalTriangleException {
        if (canh1 <= 0 && canh2 <= 0 && canh3 <= 0 && canh1 + canh2 <= canh3 && canh1 + canh3 <= canh2 && canh2 + canh3 <= canh1) {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }else {throw new IllegalTriangleException("cac canh khong phai la do dai hinh tam giac");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        double canh1 = sc.nextDouble();
        System.out.println("Nhap canh 2");
        double canh2 = sc.nextDouble();
        System.out.println("Nhap canh 3");
        double canh3 = sc.nextDouble();
        try {
            SuDungLopIllegalTriangleException tamGiac = new SuDungLopIllegalTriangleException(canh1, canh2, canh3);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }

}
