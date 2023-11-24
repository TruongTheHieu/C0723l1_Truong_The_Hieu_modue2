package ss6_module2.lop_point_va_movablepoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("nhập y");
        float y = Float.parseFloat(sc.nextLine());
        Point testPoint = new Point();
        testPoint.setXY(x, y);
        System.out.println(testPoint.toString());
        System.out.println("nhập xSpeed");
        float xSpeed = Float.parseFloat(sc.nextLine());
        System.out.println("nhập ySpeed");
        float ySpeed = Float.parseFloat(sc.nextLine());
        MovablePoint testmovablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
        System.out.println(testmovablePoint.toString());
        testmovablePoint.move();
    }
}

