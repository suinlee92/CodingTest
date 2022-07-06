package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();

        int[] bubbleTarget = new int[arrNum];
        for( int i = 0 ; i < arrNum ; i ++){
            bubbleTarget[i] = sc.nextInt();
        }

        BubbleSort2 bbs = new BubbleSort2();
        String sort = bbs.sort(arrNum, bubbleTarget);

        System.out.println(sort);

    }

    public String sort(int arrNum, int[] bubbleTarget) {
        for(int i = 0; i < arrNum; i ++ ){
            int temp = bubbleTarget[0];

            for(int j = 1; j < arrNum; j++ ){
                if( temp > bubbleTarget[j] ){
                    temp = bubbleTarget[j];
                    bubbleTarget[j] = bubbleTarget[j-1];
                    bubbleTarget[j-1] = temp;

                }
                    temp = bubbleTarget[j];

            }
        }
        return Arrays.toString(bubbleTarget);
    }
}
