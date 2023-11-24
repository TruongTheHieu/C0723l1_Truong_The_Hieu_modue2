package ss2_module2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        int Height,Width;
        Scanner input = new Scanner(System.in);
        while (choice !=0){
            System.out.println("Menu");
            System.out.println("1.print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.print("Enter your choice");
            choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.print("print the rectangle");
                System.out.println("height :");
                Height = input.nextInt();
                System.out.println("width");
                Width = input.nextInt();
                for (int i = 0; i < Height; i++) {
                    for (int j = 0; j < Width; j++) {
                        System.out.print("$");
                    }
                    System.out.print("\n");
                }break;
            case 2:
                int choose;
                System.out.println("Print the square triangle");
                System.out.println("1.top-left");
                System.out.println("2.top-right");
                System.out.println("3.botton-left");
                System.out.println("4.botton-right");
                System.out.print("Enter your choose: ");
                choose = input.nextInt();
                System.out.print("Height: ");
                Height = input.nextInt();
                switch (choose) {
                    case 1:
                        for (int i = Height; i >=1 ; i--) {
                            for (int j = 1; j <=i ; j++) {
                                System.out.print("$");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 2:
                        for (int i = Height; i >=1 ; i--) {
                            for (int j = 1; j <=Height-i ; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1 ; j <= i ; j++) {
                                System.out.print("$");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 0; i < Height; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("$");
                            }
                            System.out.print("\n");
                        }
                        break;
                    case 4:
                        for (int i = 1; i <=Height ; i++) {
                            for (int j = 1; j <=Height-i ; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1 ; j <= i ; j++) {
                                System.out.print("$");
                            }
                            System.out.println();
                        }
                        break;
                }

        }
        }
    }
}
