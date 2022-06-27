package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();

        int[] targetArr = new int[arrNum];
        for(int i = 0 ; i < arrNum ; i ++){
            targetArr[i] = scanner.nextInt();
        }

        InsertionSort is = new InsertionSort();
        String rslt = is.insertionSort(arrNum, targetArr);

        System.out.println(rslt);
    }

    public String insertionSort(int arrNum, int[] targetArr) {
        int temp = 0;
        for(int i = 1; i < arrNum; i++ ){
            for( int j = i ; j > 0 ; j--){

                if( targetArr[j] < targetArr[j-1] ){
                    temp = targetArr[j];
                    targetArr[j] = targetArr[j-1];
                    targetArr[j-1] = temp;
                }

            }
        }

        return Arrays.toString(targetArr);
    }
}
