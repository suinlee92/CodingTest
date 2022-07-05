package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class InsertionSort {

//    public static String insertion(int n, int[] array) {
//
//        int temp = 0;
//        StringBuilder result = new StringBuilder();
//
//        for(int i=1; i<n; i++) {
//            if(array[i-1] > array[i]) {
//                temp = array[i-1];
//                array[i-1] = array[i];
//                array[i] = temp;
//                for(int j = i-1; j-1>=0; j--) {
//                    if(array[j-1] > array[j]) {
//                        temp = array[j-1];
//                        array[j-1] = array[j];
//                        array[j] = temp;
//                    }
//                }
//            }
//        }
//
//        for(int i : array) {
//            result.append(i).append(" ");
//        }
//
//        return result.toString();
//    }

    public static String insertion(int n, int[] array) {

        int temp = 0;
        StringBuilder result = new StringBuilder();

        for(int i=1; i<n; i++) {
            temp = array[i];
            int j;
            for(j = i-1; j>=0; j--) {
                if(array[j] > temp) array[j+1] = array[j];
                else break;
            }
            array[j+1] = temp;
        }

        for(int i : array) {
            result.append(i).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + insertion(n, array));
    }
}
