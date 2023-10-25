package ss1_modue2;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to convert :");
        int n = Integer.parseInt(sc.nextLine());
        if(n<=10 && n>=0){
            switch (n){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("zero");
                    break;
                case 2:
                    System.out.println("tow");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("sever");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nice");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        }
    }
}
