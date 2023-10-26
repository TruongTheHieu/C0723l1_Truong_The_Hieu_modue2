package ss3_module2;

import java.lang.reflect.Array;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int x = 60;
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i <arr.length ; i++) {
            brr[i] = arr[i];
        }
        brr[brr.length -1] = x;
        arr = brr;
        System.out.println(arr.nextInt(arr));
    }
}





