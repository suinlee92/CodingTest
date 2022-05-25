package kr.co.codingTest.meotjh.chapter3;

import java.util.Scanner;

public class SumSequenceDay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sequenceDays = sc.nextInt();

        int[] numArr = new int[nums];
        for(int i = 0 ; i < nums ; i ++){
            numArr[i] = sc.nextInt();
        }

        SumSequenceDay sumSequenceDay = new SumSequenceDay();
        int result = sumSequenceDay.getRslt(nums, sequenceDays, numArr);

        System.out.println(result);


    }

    public int getRslt(int nums, int sequenceDays, int[] numArr) {
        int temp = 0;
        int result = 0;
        for(int i = 0; i < sequenceDays; i ++){

            temp += numArr[i];
        }
        result = temp;

        for(int i = sequenceDays; i < nums; i ++){
            temp += ( numArr[i] - numArr[i - sequenceDays] );
            result = Math.max(temp, result);
        }
        return result;
    }
}
