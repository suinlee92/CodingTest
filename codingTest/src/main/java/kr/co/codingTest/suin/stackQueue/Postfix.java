package kr.co.codingTest.suin.stackQueue;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public static int checkPostfix(char[] array) {

        int first = 0, second = 0;
        Stack<Integer> stack = new Stack<>();

//        for (Character c : array) {
//            if(c == '+' || c == '-' || c == '*' || c == '/') {
//                if(!stack.isEmpty()) {
//                    second = stack.pop();
//                }
//                if(!stack.isEmpty()) {
//                    first = stack.pop();
//                }
//                int temp = Character.getNumericValue(first) + Character.getDirectionality(c) + Character.getNumericValue(second);
//                stack.push(temp);
//            }else {
//                stack.push(Character.getNumericValue(c));
//            }
//        }
        for(char c : array) {
            if(Character.isDigit(c)) stack.push(c - 48);
            else {
                second = stack.pop();
                first = stack.pop();
                if(c == '+') {
                  stack.push(first + second);
                }else if (c == '-') {
                    stack.push(first - second);
                }else if (c == '*') {
                    stack.push(first * second);
                }else {
                    stack.push(first / second);
                }
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println("result : " + checkPostfix(string.toCharArray()));

    }
}
