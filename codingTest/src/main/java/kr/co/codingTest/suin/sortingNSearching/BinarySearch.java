package kr.co.codingTest.suin.sortingNSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    public static int binary(int n, int m, int[] array) {

        Arrays.sort(array);
        
        int temp = Math.round(n/2) -1;

        if(array[temp] > m) {
            for (int i = 0; i < temp; i++) {
                if(array[i] == m) {
                    return i + 1;
                }
            }
        }else {
            for (int i = temp; i < array.length; i++) {
                if(array[i] == m) {
                    return i + 1;
                }
            }
        }

        return temp + 1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + binary(n, m, array));
    }
}
