package kr.co.codingTest.suin.Point;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayMerge {

    public static int merge(int array1Count, int[] array1, int array2Count, int[] array2) {

        ArrayList<Integer> result = new ArrayList<>();
        int longger = Math.max(array1.length, array2.length);
        int shorter = Math.min(array1.length, array2.length);
        int temp = 0;

        for(int i=0; i<longger; i++) {
            for(int j=temp; j<shorter; j++) {
                if(array1[i] <= array2[j]) {
                    result.add(array1[i]);
                    temp=i;
                    break;
                }else {
                    result.add(array2[i]);
                }
            }
        }

        int index1 = 0, index2 = 0;


        boolean flag = true;

        for(int i =0, j =0; i<array1.length; i++) {
            if(flag) {
                if(array1[i] < array2[j]) {
                    result.add(array1[i]);
                }else if(array1[i] == array2[j]) {
                    result.add(array1[i]);
                    result.add(array2[j]);
                }else {
                    result.add(array2[j]);
                }
            }

        }

        for(int i=0; i<longger; i++) {
            if(i < shorter - 1) {
                if(array1[index1] <= array2[index2]) {
                    result.add(array1[index1]);
                    index1++;
                }else {
                    result.add(array2[index2]);
                    index2++;
                }
            }else {

            }
        }

        if(array1.length <= array2.length) {

        }



        for(int i=0; i<array1Count; i++) {
            for(int j=0+i; j<array2Count; j++) {
                if(array1[i] < array2[i]) {
                    result.add(array1[i]);
                }
            }
        }

        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array2.length; j++) {
                if(array1[i] < array2[j]) {
                    result.add(array1[i]);
                    break;
                }else if(array1 == array2){
                    result.add(array1[i]);
                    result.add(array2[i]);
                    break;
                }else {
                    result.add(array2[i]);
                    break;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array1Count = scan.nextInt();
        int[] array1 = new int[array1Count];
        for(int i=0; i<array1Count; i++) {
            array1[i] = scan.nextInt();
        }
        int array2Count = scan.nextInt();
        int[] array2 = new int[array2Count];
        for(int i=0; i<array2Count; i++) {
            array2[i] = scan.nextInt();
        }

        System.out.println("result : " + merge(array1Count, array1, array2Count, array2));

    }
}
