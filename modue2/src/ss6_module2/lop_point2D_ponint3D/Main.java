package ss6_module2.lop_point2D_ponint3D;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập X:");
        float X = Float.parseFloat(sc.nextLine());
        System.out.println("nhập Y :");
        float Y = Float.parseFloat(sc.nextLine());
        Point2D tetsPoint2d = new Point2D(X,Y);
        System.out.println("Point2D : " + tetsPoint2d.toString());
        //tetsPoint3D
        System.out.println("nhập Z : ");
        float Z = Float.parseFloat(sc.nextLine());
        Point3D tetsPoint3d = new Point3D(X,Y,Z );
        System.out.println("Point3D :" + tetsPoint3d.toString());
    }
}
