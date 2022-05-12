package kr.co.codingTest.meotjh.chapter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckedPatternMax {

    public static void main(String[] args) {

        CheckedPatternMax cpm = new CheckedPatternMax();
        Scanner sc = new Scanner(System.in);
        Integer nums = sc.nextInt();
        sc.nextLine();

        int[][] allData = new int[nums][nums];
        for( int i = 0 ; i < nums ; i ++ ){
            int[] oneRow = Arrays.stream( sc.nextLine().split(" ") )
                    .mapToInt(Integer::parseInt)
                    .toArray();
            allData[i] = oneRow;
        }

        Integer rslt = cpm.makeMaxNum(nums, allData);
        System.out.println(rslt);

    }

    public Integer makeMaxNum (Integer nums, int[][] allData) {

        Integer diagonalR = 0;
        Integer diagonalL = 0;
        Integer rowTemp;
        Integer colTemp;
        Integer temp = 0;

        for(int i = 0; i < nums; i ++){

            diagonalR = diagonalR + allData[i][i];
            diagonalL = diagonalL + allData[i][(nums -1)-i];

            rowTemp = 0;
            colTemp = 0;
            for(int j = 0; j < nums; j ++){

                colTemp = colTemp + allData[j][i];
                rowTemp = rowTemp + allData[i][j];

            }

            if( colTemp <  rowTemp ){
                temp = rowTemp;
            }else{
                temp = colTemp;
            }

        }

        Integer[] rslt = { diagonalL, diagonalR, temp };

        return calMaxArrVal(rslt);
    }

    private Integer calMaxArrVal(Integer[] rslt) {
        Arrays.sort(rslt, Collections.reverseOrder());
        return rslt[0];
    }
}
