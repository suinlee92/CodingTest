package kr.co.codingTest.suin.sortingNSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleCheck {

//    public static String doubleCheck(int n, int[] array) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(array[i] == array[j]) return "D";
//            }
//        }
//
//        return "U";
//    }

    //정렬 이용해서 풀기
    public static String doubleCheck(int n, int[] array) {

        Arrays.sort(array);

        for (int i = 0; i < n-1; i++) {
            if(array[i] == array[i+1]) return "D";
        }
        return "U";
    }

    //해쉬맵 이용해서 풀기

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + doubleCheck(n, array));
    }

}
