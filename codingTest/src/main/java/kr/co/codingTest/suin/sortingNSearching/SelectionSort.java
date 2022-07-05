package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class SelectionSort {

    public static String selection(int n, int[] array) {

        StringBuilder string = new StringBuilder();
        int min = 0, index = 0, temp = 0;
        boolean change = false;

        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j=i+1; j<array.length; j++) {
                if(min>array[j]) {
                    min = array[j];
                    index = j;
                    change = true;
                }
            }
            if(change) {
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                change = false;
            }
        }

        for (Integer i: array) {
            string.append(i).append(" ");
        }

        return string.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + selection(n, array));
    }
}
