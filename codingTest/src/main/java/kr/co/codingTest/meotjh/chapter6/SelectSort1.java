package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class SelectSort1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrNums = sc.nextInt();

        int[] sortTarget = new int[arrNums];

        for(int i = 0 ; i < arrNums ; i ++){
            sortTarget[i] = sc.nextInt();
        }

        SelectSort1 ss = new SelectSort1();
        String sorted = ss.selecSortV2(arrNums, sortTarget);

        System.out.println(sorted);
    }

    public String selecSortV1(int arrNums, int[] sortTarget) {
        int selectedNums = 0;
        int selectedIdx = 0;
        for(int i = 0; i < arrNums; i ++){
            selectedNums = sortTarget[i];
            selectedIdx = 0;

            for(int j = i; j < arrNums; j ++){

                if( selectedNums > sortTarget[j] ){
                    selectedNums = sortTarget[j];
                    selectedIdx = j;
                }

            }

            if( selectedIdx != 0){
                sortTarget[selectedIdx] = sortTarget[i];
                sortTarget[i] = selectedNums;
            }

        }
        return Arrays.toString(sortTarget);
    }

    public String selecSortV2(int arrNums, int[] sortTarget) {
        int idx = 0;
        for(int i = 0; i < arrNums; i ++){
            idx = i;

            for(int j = i ; j < arrNums; j ++){

                if( sortTarget[idx] > sortTarget[j] ){
                    idx = j;
                }

            }

            int temp = sortTarget[i];
            sortTarget[i] = sortTarget[idx];
            sortTarget[idx] = temp;

        }
        return Arrays.toString(sortTarget);
    }
}
