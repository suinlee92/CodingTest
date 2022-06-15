package kr.co.codingTest.suin.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    public static String check(String string) {

        char[] array = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : array) {
            if(c == '(') {
                stack.push(c);
            }else if(c == ')') {
                if(stack.isEmpty()) {
                    return "NO";
                }else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) return "NO";

        return "YES";
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        System.out.println("result : " + check(string));
    }
}
