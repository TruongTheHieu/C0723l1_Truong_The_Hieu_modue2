package ss3_module2;

import java.util.Scanner;

public class TinhTongCacSooMotCotXacDinh {
    public static void main(String[] args) {
        //b1: cho phep nguoi dùng nhập vào 2 mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số hàng :");
        int rows = scanner.nextInt();
        System.out.println("nhập số cột :");
        int cosl = scanner.nextInt();
        //b2: nhập vào thứ tự của cột  tính từ 0
        int[][] arr = new int[rows][cosl];
        System.out.println("Nhập phần tử của hàng và cột");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cosl; j++) {
                System.out.print("Nhập giá trị cho từng phần tu của hàng" + (i) +"và cột"+ (j) + ": ");
                arr[i][j] = scanner.nextInt();
            }
            }
        //in ra mảng 2 chiều vừa nhập
        System.out.println("Mảng 2 chiều vưà nhập");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cosl ; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //tinh tổng của cột
        System.out.println("Nhập cột mà bạn cần tính tổng :" );
        int indexCosl = scanner.nextInt();
        int sum = 0;
        if (0 <= indexCosl && indexCosl < rows){
            for (int i = 0; i <arr.length ; i++) {
                sum += arr[i][indexCosl];
            }
            }else System.out.println("giá trị cột không hợp lệ");
        System.out.println("tổng giá trị của cột " + indexCosl + "là :" + sum);
        }
        }



