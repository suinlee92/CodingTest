package kr.co.codingTest.meotjh.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class TempLeader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer stuNums = sc.nextInt();
        int[][] allStuCls = new int[stuNums][5];

        for(int i=0; i<stuNums; i++){
            for(int j=0; j<stuNums; j++){
                allStuCls[i][j]=sc.nextInt();
            }
        }

        TempLeader tl = new TempLeader();
        int tempLeader = tl.calTempLeader(stuNums, allStuCls);

        System.out.println(tempLeader);

    }

    public int calTempLeader(Integer stuNums, int[][] allStuCls) {
        int[] result = new int[stuNums];
        boolean[] stuFlag = new boolean[stuNums];

        int tempStuCls = 0;

        for(int p = 0; p < stuNums; p ++){

            for( int i = 0 ; i < 5 ; i++){ //5학년 까지라 for문
                tempStuCls = allStuCls[p][i];
                for(int j = 0; j < stuNums; j++ ){

                    if( tempStuCls == allStuCls[j][i] && ( allStuCls[j] != allStuCls[p] ) ){
                        stuFlag[j] = true;
                    }

                }

            }

            int SameClassStuCnt = calSameClassStuCnt(stuFlag);
            result[p] = SameClassStuCnt;

        }

        int TempLeaderIdx = calTempLeaderIdx(result);
        return TempLeaderIdx;
    }

    private int calSameClassStuCnt(boolean[] stuFlag) {

        int boolCnt = 0;
        for (boolean b : stuFlag) {
            if( b == true) boolCnt++;
        }
        Arrays.fill(stuFlag, Boolean.FALSE);
        return boolCnt;

    }

    private int calTempLeaderIdx(int[] result) {
        int maxAt = 0;

        for (int i = 0; i < result.length; i++) {
            maxAt = result[i] > result[maxAt] ? i : maxAt;
        }

        return maxAt + 1;
    }

}
