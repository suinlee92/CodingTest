package kr.co.codingTest.suin.Point;

import java.util.Scanner;

public class Subsequcence {

//    public static int subsequcence(int[] subsequcence, int sum, int count) {
//
//        int result = 0, resultSum = 0, temp=0;
//
//        for(int i=0; i<count; i++) {
//            temp = subsequcence[i];
//            for(int j=i+1; j<count; j++) {
//                temp += subsequcence[j];
//                if(temp == sum) result ++;
//                if(temp > sum) break;
//            }
//            temp = 0;
//        }
//
//        return result;
//    }

    //강사꺼
    public static int test(int[] subsequcence, int sum, int count) {

        int lt = 0, tempSum =0, result =0;

        for(int rt=0; rt<count; rt++) {
            tempSum += subsequcence[rt];
            if(tempSum == sum) result++;
            while(tempSum >= sum) {
                tempSum -= subsequcence[lt++];
                if(sum == tempSum) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = scan.nextInt();
        int[] subsequcence = new int[count];

        for(int i=0; i<count; i++) {
            subsequcence[i] = scan.nextInt();
        }

        System.out.println("result : " + test(subsequcence, sum, count));
    }
}
