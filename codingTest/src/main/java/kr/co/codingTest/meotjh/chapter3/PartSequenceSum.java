package kr.co.codingTest.meotjh.chapter3;

import java.util.Scanner;

public class PartSequenceSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sumNums = sc.nextInt();

        int[] numArr = new int[nums];
        for(int i = 0 ; i < nums ; i ++ ){

            numArr[i] = sc.nextInt();
        }
        PartSequenceSum partSequenceSum = new PartSequenceSum();

        int rslt = partSequenceSum.calSequenceNums(nums, sumNums, numArr);

        System.out.println(rslt);
    }

    public int calSequenceNums(int nums, int sumNums, int[] numArr) {
        int temp = 0;
        int j = 0;
        int rslt = 0;
        for(int i = 0; i < nums; i ++){

            j = i;
            while(temp < sumNums){

                if( j == nums){
                    break;
                }

                temp += numArr[j];
                j++;
            }

            if( temp == sumNums){
                rslt++;
            }
            temp = 0;
        }
        return rslt;
    }
}
