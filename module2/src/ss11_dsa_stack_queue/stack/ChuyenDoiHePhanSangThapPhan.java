package ss11_dsa_stack_queue.stack;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHePhanSangThapPhan {
    public static void main(String[] args) {
        System.out.println("nhập một số nguyên từ bàn phím ");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> binary = new Stack<Integer>();
        int x = sc.nextInt();
        while (x>0){
            int soDu = x%2;
            binary.push(soDu);
            x = x/2;
        }
        System.out.println("số nhị phần là :");
        int n = binary.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(binary.pop());
        }
    }
}
