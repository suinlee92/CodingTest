package kr.co.codingTest.meotjh.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class IronBar55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String targets = sc.nextLine();

        IronBar55 ironBar = new IronBar55();
        int result = ironBar.mySolution(targets);

        System.out.println(result);

    }

    /**
     * 그냥 result에 ++넣어도 될걸 temp변수 만들어서 더해준것
     * -> 알고리즘상 매번 ++ 해도된다는걸 캐치하지 못했기에 구현 못함
     * 저 포인트를 놓쳐서 코드가 많이 늘었다.
     */
    public int mySolution(String targets) {
        Stack<Character> stack = new Stack<>();
        int result = 0 ;
        int temp = 0;
        char[] target = targets.toCharArray();
        for(int i = 0; i < targets.length() ; i ++){

            if( target[i] == '('){
                stack.push(target[i]);
            }else{

                if( i != (targets.length()-1) ){
                    stack.pop();
                }

                if( target[i-1] != ')' || i == (targets.length()-1) ){
                    temp = temp + stack.size();
                    result = result +temp;
                    temp = 0;
                }else{
                    temp++;
                }
            }
        }
        return result;
    }

    public int solution(String str){
        int cnt=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== '(' ) stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(' ) cnt+=stack.size();
                else cnt++;
            }
        }
        return cnt;
    }
}
