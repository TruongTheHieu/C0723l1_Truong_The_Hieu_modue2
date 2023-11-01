package ss5_thuchanh_module2;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //khai bao bien,nhap va kiem tra kich thuoc mang.
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("size should not exceed 30");
            }
        }  while (size > 30);
        //b2: nhap gia tri cho tung mang
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter a mark for student" + (i+1) +":");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("list of mark");
        for (int j = 0; j < array.length ; j++) {
            System.out.println(array[j] + "\t");
            if(array[j] >= 5 && array[j] <=10)
                count++;
        }
        System.out.print("The number of students passing the exam is : " +"\t" + count);
    }
}
