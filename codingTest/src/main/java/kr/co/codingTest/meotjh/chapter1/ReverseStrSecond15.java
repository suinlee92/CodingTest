package kr.co.codingTest.meotjh.chapter1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseStrSecond15 {

    static boolean isEnglish( String value ){
        return Pattern.matches("^[a-zA-Z]*$", value );
    }

    public String solution( String value ){
        ReverseStrSecond15 rss = new ReverseStrSecond15();

        char[] targetArr   = value.toCharArray();
        Integer targetArrLength = targetArr.length;
        Integer startIdx = 0,
                endIdx = targetArrLength - 1 ;


        while(startIdx < endIdx ){

            String startChar = String.valueOf( targetArr[startIdx] );
            String endChar = String.valueOf( targetArr[endIdx] );
            char temp;

            if( rss.isEnglish( startChar ) == false ){
                startIdx += 1;
            }else if ( rss.isEnglish( endChar ) == false){
                endIdx -=1;
            }else{

                temp = targetArr[startIdx];
                targetArr[startIdx] = targetArr[endIdx];
                targetArr[endIdx] = temp;
                startIdx += 1;
                endIdx -= 1;

            }

        }

        return String.valueOf(targetArr);
    }

    public static void main(String[] args) {

        ReverseStrSecond15 rss = new ReverseStrSecond15();
        Scanner sc = new Scanner(System.in);
        String targetString = sc.next();
        String targetArr = rss.solution(targetString);
        System.out.println( targetArr );

    }
}
