package kr.co.codingTest.meotjh.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Bracket51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();

        Bracket51 bracket51 = new Bracket51();
        String rslt = bracket51.getResultStack(brackets);

        System.out.println(rslt);

    }

    public String getResult(String brackets) {

        int temp = 1;
        char[] bracketArr = brackets.toCharArray();

        String rslt = "YES";

        long rightBrCnt = brackets.chars().filter(c -> c == '(').count();
        long leftBrCnt = brackets.chars().filter(c -> c == ')').count();

        if( rightBrCnt != leftBrCnt ){
            return "NO";
        }

        loop:
        for(int i = 0 ; i < bracketArr.length ; i ++){

            if( bracketArr[i] == '(' ){
                for( int j = i+1 ; j < bracketArr.length ; j ++){

                    if( bracketArr[j] == '('){
                        temp ++;
                    }else{
                        temp --;

                        if( temp == 0) break;
                    }

                }

                if( temp != 0 ){
                    return "NO";
                }else{
                    temp = 1;
                }

            }

        }
        return rslt;
    }

    public String getResultStack(String brackets){
        String rslt = "YES";
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {

            if( bracket == '(' ){
                stack.push(bracket);
            }else{
                if( stack.isEmpty() ){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(stack.isEmpty() == false ){
            return "NO";
        }

        return rslt;

    }
}
