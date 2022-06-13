package kr.co.codingTest.meotjh.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class PostFix53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String targets = sc.nextLine();
        PostFix53 postFix53 = new PostFix53();
        Integer result = postFix53.getPostFixAnswer(targets);
        System.out.println(result);
    }

    public Integer getPostFixAnswer(String targets) {
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        for (char target : targets.toCharArray()) {
            if( Character.isDigit(target) ){
                stack.push( Character.getNumericValue( target ) );
            }else{

                int oL = stack.pop();
                int oR = stack.pop();

                switch(target) {
                    case '+':
                        temp = oR + oL;
                        break;
                    case '-':
                        temp = oR - oL;
                        break;
                    case '*':
                        temp = oR * oL;
                        break;
                    case '/':
                        temp = oR / oL;
                        break;
                    default:
                }

                stack.push(temp);
                temp = 0;

            }
        }
        return stack.pop();
    }
}
