package ss3_module2;


import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        //b1. Nhap so phan tu khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang");
        int n = Integer.parseInt(sc.nextLine());
        int [] arr1 = new int[n];
        System.out.println("Nhap gia tri cac phan tu mang");
        for (int i = 0; i <arr1.length; i++) {
            System.out.printf("arr1[%d]=",i);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        //b2:In gia tri cua cac phan tu mang truoc khi them
        System.out.println("Cac phan tu mang truoc khi them");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.printf("%d\t",arr1[i]);
        }
        System.out.printf("\n");
    //b3:Nhap vao gia tri can them va chi so can chen vao mang
        System.out.println("Nhap vao gia tri can chen vao mang");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao chi so can chen vao mang");
        int indexInsert = Integer.parseInt(sc.nextLine());
        //b4:khoi tao mang moi arrNew de chua cac phan tu gom ca phan tu dc them
        int [] arrNew = new int [arr1.length +1];
        //b5: coppy cac phan tu mang arr1 va them phan tu moi vao mang arrNew 
        for (int i = 0; i <arrNew.length ; i++) {
            if(i<indexInsert){
                arrNew[i]= arr1[i];
            } else if (i==indexInsert) {
                arrNew[i] = valueInsert;
            } else {
                arrNew[i]= arr1[i-1];
            }
        }
        //b6:in ra cac phan tu sau khi dc them moi
        System.out.println("gia tri cua cac phan tu dc them moi");
        for (int i= 0;i <arrNew.length;i++){
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
    }

}





