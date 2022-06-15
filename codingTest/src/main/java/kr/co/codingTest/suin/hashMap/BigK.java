package kr.co.codingTest.suin.hashMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BigK {

    public static int findK(int length, int k, int[] array) {
        int result = 0;

        Arrays.sort(array);
        result = (array[length-1]) + (array[length-2]) + (array[length-k-2]);

        System.out.println(array[length-1]);
        System.out.println(array[length-2]);
        System.out.println(array[length-k-2]);

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[length];

        for(int i=0; i<length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("result: " + findK(length, k, array));
    }
}
