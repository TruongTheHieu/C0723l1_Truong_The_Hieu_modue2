package ss11_dsa_stack_queue.stack;



import java.util.Scanner;
import java.util.Stack;

public class ReverseByUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> arrayInt = new Stack<>();
        System.out.println("nhập vào mảng số có 5 phần tử");
        for (int i = 0; i <5 ; i++) {
            int n = Integer.parseInt(sc.nextLine());
            arrayInt.push(n);
        }System.out.println("mảng ban đầu là :" + arrayInt);
        System.out.println("mảng sau khi đảo");
        for (int i = 0; i <arrayInt.size() ; i++) {
            System.out.println(arrayInt.pop());
        }

    }
}


