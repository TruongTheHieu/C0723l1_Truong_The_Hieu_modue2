package ss4_module2;

import ss4_module2.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a :" );
        double a = scanner.nextDouble();
        System.out.println("Nhap b :");
        double b = scanner.nextDouble();
        System.out.println("Nhap c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta= "+ quadraticEquation.getDiscriminant());
        double delta = quadraticEquation.getDiscriminant();
        if(delta >= 0){
            System.out.print("nghhiem 1 = "+ quadraticEquation.getRoot1());
            System.out.print("\nnghiem 2 = "+ quadraticEquation.getRoot2());
        }else if (delta == 0){
            System.out.print("phuong trinh co 1 nghiem"+ -b/2*a);
        }else {
            System.out.print("The equation has no roots");
        }
    }
}
