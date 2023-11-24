package ss2_module2;

public class HienThi100SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100 :");
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int j = 2; j < Math.sqrt(x); j++) {
            if (x % j == 0) {
                return false;

            }

        }
        return true;
    }
}
