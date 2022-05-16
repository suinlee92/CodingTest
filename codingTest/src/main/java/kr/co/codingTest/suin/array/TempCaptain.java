package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class TempCaptain {

    public static int captain(int[][] array, int cnt) {

        int[] cntArray = new int[cnt];
        
        //학생
        for(int i=0; i<cnt; i++) {
            //학년
            for(int j=0; j<cnt; j++) {
                //비교
                for(int k=0; k<cnt; k++) {
                    if(array[i][j] == array[k][j]) {
                        cntArray[i]++;                
                    }
                }
            }
            cntArray[i] = cntArray[i];
        }

        int temp = 0, index = 0;

        for(int i=0; i<cntArray.length; i++) {
            if(temp < cntArray[i]) {
                temp = cntArray[i];
                index = i + 1;
            }
        }

        return index;
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
        System.out.println("result : " + captain(array, cnt));
    }
}
