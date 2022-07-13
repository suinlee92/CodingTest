package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class Rascal {

    public static String findRascal(int n, int[] array) {

        int lt = 1, rt = n-1-1;
        int person1 = 0, person2 = 0;

        for (int i = 0; lt < n; i++) {
            if(array[i] > array[lt]) {
                person1 = i + 1;
                break;
            }
            lt++;
        }

        for (int i = n-1; rt < n; i--) {
            if(array[i] < array[rt]) {
                person2 = i + 1;
                break;
            }
            rt++;
        }

        StringBuilder result = new StringBuilder();
        result.append(person1).append(" ").append(person2);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + findRascal(n, array));
    }
}
