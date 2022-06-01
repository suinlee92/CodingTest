package kr.co.codingTest.meotjh.chapter3;

import java.util.Scanner;

public class MaxLengthConsecutiveNumberSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int conseNums = sc.nextInt();
        int cnt = sc.nextInt();

        int[] conseArr = new int[conseNums];
        for(int i = 0 ; i < conseNums ; i ++){
            conseArr[i] = sc.nextInt();
        }

        int rt = 0 ,lt = 0, changeCnt = 0, answer =0;
        for( rt = 0 ; rt < conseNums ; rt++ ){

            if( conseArr[rt] == 0) {
                changeCnt ++;
            }

            while( changeCnt > cnt ){
                if( conseArr[lt] == 0 ){
                    changeCnt --;
                }
                lt++;
            }
            answer = Math.max( answer , rt-lt +1 );

        }

        System.out.println(answer);

    }
}
