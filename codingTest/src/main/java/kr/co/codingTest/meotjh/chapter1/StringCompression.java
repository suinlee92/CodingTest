package kr.co.codingTest.meotjh.chapter1;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        String target = "KKHSSSSSSSE";//new Scanner(System.in).next();

        char[] targetCharArr = target.toCharArray();
        Character temp = targetCharArr[0];
        Integer tempNum = 0;
        StringBuilder sb = new StringBuilder();
        for( int index = 0 ; index < targetCharArr.length; index ++ ){

            if( temp != target.charAt(0)){
                temp = target.charAt(0);
            }

            if( temp == targetCharArr[index] ){
                tempNum ++;
                if(target.length() != 1) target = target.substring(index+1);
            }else{
                sb.append(temp).append(tempNum.toString());
                tempNum = 0;
            }

        }
        System.out.println("sb = " + sb);
    }
}
