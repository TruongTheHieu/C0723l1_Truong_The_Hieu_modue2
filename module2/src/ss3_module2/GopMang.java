package ss3_module2;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang1");
        int n1 = Integer.parseInt(sc.nextLine()) ;
        int [] arr1 = new int[n1];
        System.out.println("Nhap gia tri cac phan tu mang 1");
        for (int i = 0; i <arr1.length; i++) {
            System.out.printf("arr1[%d]=",i);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap so luong phan tu cua mang2");
        int n2 = Integer.parseInt(sc.nextLine()) ;
        int [] arr2 = new int[n2];
        System.out.println("Nhap gia tri cac phan tu mang 2");
        for (int i = 0; i <arr2.length; i++) {
            System.out.printf("arr2[%d]=",i);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int [] arr3 = new int [n1+n2];
        for (int i = 0;i <n1;i++){
            arr3[i]= arr1[i];
        }
        for (int i= 0;i <n2;i++){
            arr3[i +n1]= arr2[i];
        }
        System.out.println("Mang sau khi gop :");
        for (int i = 0; i < (n1+n2) ; i++) {
            System.out.println("arr3["+i+"]=" + arr3[i]);;
        }
    }
}
