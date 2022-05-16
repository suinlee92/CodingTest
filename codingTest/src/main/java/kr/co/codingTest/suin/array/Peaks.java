package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Peaks {

    public static int peaksCnt(int[][] array, int cnt) {

        int peaksCnt = 0;

        for(int i=1; i<cnt; i++) {
            for(int j=1; j<cnt; j++) {
                if(array[i-1][j] < array[i][j] && array[i][j-1] < array[i][j] && array[i+1][j] < array[i][j] && array[i][j+1] < array[i][j]) {
                    peaksCnt++;
                }
            }
        }

        return peaksCnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt() + 2;
        int[][] array = new int[cnt][cnt];

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                if(i == 0 || i == cnt -1 || j == 0 || j == cnt -1) {
                    array[i][j] = 0;
                }else {
                    array[i][j] = scan.nextInt();
                }
            }
        }
        System.out.println("result : " + peaksCnt(array, cnt));

    }
}
