package ss3_module2;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        //b1:khai bao mang so nguyen co size pt
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size PT");
        int size = sc.nextInt();
        int arrayNumber[] = new int[size];

        //b2:nhap gia tri cua cac phan tu
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu" + (i + 1) + ": ");
            arrayNumber[i] = sc.nextInt();
        }
        //b3: goi phan tu dau tien la phan tu nho nhat
        int minValue = arrayNumber[0];
        for (int i = 1; i < size; i++) {
            if (arrayNumber[i] < minValue);
            minValue = arrayNumber[i];
        }
        System.out.println("gia tri nho nhat la" + minValue);
    }

}



