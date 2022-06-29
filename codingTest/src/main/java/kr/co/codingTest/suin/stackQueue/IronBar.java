package kr.co.codingTest.suin.stackQueue;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    public static int cutBar(char[] bracket) {

        int result = 0;
        Stack<Character> stack = new Stack<>();
        //레이저였는지 아닌지 파악
        boolean flag = false;

        for(char c : bracket) {
            if(c == '(') {
                flag = true;
                stack.push(c);
            }else {
                if(!stack.isEmpty()) {
                    stack.pop();
                    if(flag) {
                        result += stack.size();
                    }else {
                        result++;
                    }
                }
                flag = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bracket = scan.nextLine();

        System.out.println("result : " + cutBar(bracket.toCharArray()));
    }
}
