package kr.co.codingTest.meotjh.chapter3;

import java.util.Scanner;

public class NumOfCaseSum35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        NumOfCaseSum35 numOfCaseSum35 = new NumOfCaseSum35();
        int rslt = numOfCaseSum35.getAnswer(num);

        System.out.println(rslt);
    }

    public int getAnswer(int num) {
        int temp = 0;
        int rslt = 0;
        for(int i = 1; i < num; i ++ ){

            for(int j = i; j < num; j ++){
                temp += j;

                if( temp == num){
                    rslt++;
                    temp = 0;
                    break;
                }else if ( temp > num){
                    temp = 0;
                    break;
                }

            }
        }
        return rslt;
    }
}
