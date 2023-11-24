package ss11_dsa_stack_queue.stack;


import java.util.*;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        Stack<Character> string1 = new Stack<>();
        Queue<Character> string2 = new LinkedList<>();
        int temp = 0;
        for (char h : inputWord.toCharArray()) {
            string1.push(h);
            string2.offer(h);
            temp++;
        }
        boolean flag = true;
        for (int i = 0; i < temp; i++) {
            if (!string1.pop().equals(string2.poll())) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("is Paridrome");
        } else {
            System.out.println(" not Paridrome");
        }

    }
}

