package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class SumMax {

    public static int sumMax(int[][] array, int cnt) {

        int maxValue = 0, horizontalSum = 0, lengthSum = 0, diagonalSum1 = 0, diagonalSum2 = 0;
        int temp = cnt;

        //가로세로
        for(int i=0; i<cnt; i++) {
            horizontalSum = 0;
            lengthSum = 0;
            //오른쪽 대각선
            diagonalSum2 += array[i][temp-1];
            temp--;
            for(int j=0; j<cnt; j++) {
                //가로
                horizontalSum += array[i][j];
                //세로
                lengthSum += array[j][i];
                //왼쪽 대각선
                if(i == j) {
                    diagonalSum1 += array[i][j];
                }
            }
            if(maxValue < horizontalSum) {
                maxValue = horizontalSum;
            }else if(maxValue < lengthSum) {
                maxValue = lengthSum;
            }else if (i == cnt-1 && maxValue < diagonalSum1) {
                maxValue = diagonalSum1;
            }else if(i == cnt-1 && maxValue < diagonalSum2) {
                maxValue = diagonalSum2;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] array = new int[cnt][cnt];

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("result : " + sumMax(array, cnt));

    }
}
