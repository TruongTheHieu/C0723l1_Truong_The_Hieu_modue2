package ss11_dsa_stack_queue.stack;


import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    private String string;

    public Bracket(String string) {
        this.string = string;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi dau ngoac can kiem tra :");
        String string = sc.nextLine();
        if (checkBracket(string)){
            System.out.println("chuoi hop le");
        }else System.out.println("chuoi k hop le");
    }

    private static boolean checkBracket(String string){
        Stack<Character> bStack = new Stack<>(); //stack chua dau ngoac
        for (int i = 0; i < string.length(); i++) {
            //check xem ky tu co phai la mo ngoac k, neu co push vao stack
            if (string.charAt(i) == '('||string.charAt(i) == '['||string.charAt(i) == '{') {
                bStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')'||string.charAt(i) == ']'||string.charAt(i) == '}') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left=bStack.pop();
                if(!matchBraket(left,string.charAt(i))){
                    return false;
                }

            }

        }
        return bStack.isEmpty();
    }
    private static boolean matchBraket(char left, char right){
        return (left=='{'&& right=='}')||(left=='['&& right==']')||(left=='('&& right==')');
    }

}