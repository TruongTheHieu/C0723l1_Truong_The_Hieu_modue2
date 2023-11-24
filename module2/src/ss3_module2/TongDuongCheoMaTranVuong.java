package ss3_module2;

import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static int tongDuongCheo(int [][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i==j){
                    sum += arr[i][j];
                }

            }
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng của mảng  :");
        int n = sc.nextInt();
        System.out.println("Nhập chiều dài của mảng");
        int m = sc.nextInt();
        if (n != m) {
            System.out.println("Nhập 2 chiều bằng nhau");
        } else {
            int arr[][] = new int[n][m];
            System.out.println("Nhập phần tử của hàng và cột");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("Nhap phan tu của hang" + (i) + "cot" + (j));
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Mảng sau khi nhập là :");
            for (int i = 0; i <n; i++) {
                for (int j = 0; j <m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println("tổng của đường chéo :" + tongDuongCheo(arr));

        }
    }
}
