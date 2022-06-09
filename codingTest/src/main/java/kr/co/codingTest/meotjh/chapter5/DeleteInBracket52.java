package kr.co.codingTest.meotjh.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class DeleteInBracket52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String targets = sc.nextLine();

        DeleteInBracket52 deleteInBracket52 = new DeleteInBracket52();
        String result = deleteInBracket52.getResult(targets);

        System.out.println(result);

    }

    public String getResult(String targets) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char target : targets.toCharArray()) {

            if(stack.isEmpty() && target != '(') {
                stringBuilder.append(target);
            }

            if( target == '(' ){
                stack.push(target);
            }else if( target == ')'){
                stack.pop();
            }

        }
        return stringBuilder.toString();
    }
}
