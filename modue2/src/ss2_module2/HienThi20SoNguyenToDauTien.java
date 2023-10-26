package ss2_module2;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBers = 20;
        System.out.println("kết quả");
        int count = 0;
        int i = 2;
        while (count < numBers) {
            if (isPrime(i)) {
                System.out.println(i + "");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
