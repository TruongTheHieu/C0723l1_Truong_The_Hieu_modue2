import java.util.Scanner;

public class UngDungChuyenDoiTien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleas enter the usd amount");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("value in vnd : " + quydoi);
    }
}
