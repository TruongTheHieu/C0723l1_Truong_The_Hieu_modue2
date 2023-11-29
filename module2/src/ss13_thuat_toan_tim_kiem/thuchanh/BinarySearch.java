package ss13_thuat_toan_tim_kiem.thuchanh;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int left = 0;
        int right = list.length - 1;
        System.out.println("nhập giá trị cần tìm trong mảng");
        int value = Integer.parseInt(sc.nextLine());
//        int value = 50;
        int result = binarySearch(list, value, left, right);
        if(result == -1 ){
            System.out.println("không tìm thấy");
        }else {
            System.out.println("phần tử nằm ở vị trí thu" + result);
        }
    }


    public static int binarySearch(int[] arr, int value, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }
}

