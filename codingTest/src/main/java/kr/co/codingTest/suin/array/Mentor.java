package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Mentor {

    public static int mentor(int[][] array, int student, int test) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int test = scan.nextInt();
        int[][] array = new int[student][test];

        for(int i=0; i<student; i++) {
            for(int j=0; j<test; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        mentor(array, student, test);
    }
}
