package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class BubbleSort {

    public static String bubbleSort(int n, int[] array) {

        int temp = 0;
        StringBuilder result = new StringBuilder();

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i; j++) {
                if(i != 0) {
                    if(array[j] > array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

        for(int i : array) {
            result.append(i + " ");
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

        System.out.println("result : " + bubbleSort(n, array));
    }
}
