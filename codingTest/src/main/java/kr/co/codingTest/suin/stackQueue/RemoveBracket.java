package kr.co.codingTest.suin.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {

    public static String removeBracket(char[] array) {

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        for (char c:array) {
            if(c == ')') {
                while (stack.pop() != '(');

            }else {
                stack.push(c);
            }
        }

        for(Character c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        System.out.println("result : " + removeBracket(string.toCharArray()));
    }
}
