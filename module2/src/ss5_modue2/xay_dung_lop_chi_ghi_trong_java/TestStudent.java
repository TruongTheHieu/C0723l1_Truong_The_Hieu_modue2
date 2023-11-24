package ss5_modue2.xay_dung_lop_chi_ghi_trong_java;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name :" + student.getName());
        System.out.println("class :" + student.getClasses());
        System.out.println("chang name and class");
        Scanner sc = new Scanner(System.in);
        System.out.println("input new name ");
        String newName = sc.nextLine();
        student.setName(newName);
        System.out.println("input new class");
        String newClass = sc.nextLine();
        student.setClasses(newClass);
        System.out.println("name : "+ student.getName());
        System.out.println("class : " + student.getClasses());
    }
}
