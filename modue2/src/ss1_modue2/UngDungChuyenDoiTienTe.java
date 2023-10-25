package ss1_modue2;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền Vnd");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("giá trị vnd : " + quydoi);
    }
}
