package ss3_module2;


import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap  so hang");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap  so cot");
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap gia tri tai hang : " + (i + 1) + " cot " + (j + 1));
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("giá trị lớn nhất :" + findmax(arr));

    }
    public static int findmax (int[][] arr){
        int maxValue = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                    if (arr[i][j] == arr[0][0]){
                        maxValue = arr[i][j];
                    } else if (arr[i][j]> maxValue) {
                        maxValue= arr[i][j];
                    }
            }

        }
        return maxValue;
    }

}




