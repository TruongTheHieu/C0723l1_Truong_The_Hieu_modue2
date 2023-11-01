package ss3_module2;

import java.util.Scanner;

public class DemKyTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự cần đếm :");
        char characTer = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if( str.charAt(i)== characTer){
                count++;
            }

        }
        System.out.println("số lần xuất hiện trong chuỗi"+ characTer + "là :" + count);

    }


}
