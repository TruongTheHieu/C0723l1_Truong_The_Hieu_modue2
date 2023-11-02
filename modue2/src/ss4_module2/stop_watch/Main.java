package ss4_module2.stop_watch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("nhap so phan tu trong mang");
        int n = Integer.parseInt(sc.nextLine());
        int []array = new int[n];
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(1000);
        }
        StopWatch test = new StopWatch();
        test.start();
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        test.end();
        System.out.println("Thoi gian thuc thi :" + test.getElapsedTime());

    }
}
