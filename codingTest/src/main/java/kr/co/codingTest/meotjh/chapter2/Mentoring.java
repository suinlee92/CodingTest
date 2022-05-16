package kr.co.codingTest.meotjh.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Mentoring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stuNums = sc.nextInt();
        int examNums = sc.nextInt();

        Integer[][] allData = new Integer[examNums][stuNums];

        for(int i=0; i<examNums; i++){
            for(int j=0; j<stuNums; j++){
                allData[i][j]=sc.nextInt();
            }
        }

        Mentoring m = new Mentoring();
        int answer = m.findMentorNumberOfCase(stuNums, examNums, allData);

        System.out.println("answer = " + answer);

    }

    public int findMentorNumberOfCase(int stuNums, int examNums, Integer[][] area) {
        boolean[] stuFlag = new boolean[stuNums];
        int answer = 0;

        changeBoolArrTrue(stuFlag);

        for(int mtor = 1; mtor <= stuNums; mtor++ ){
            for(int exam = 0; exam < examNums; exam++){
                for(int mtee = 0; mtee  < stuNums; mtee ++){

                    int mtorIdx = Arrays.asList( area[exam] ).indexOf( mtor );

                    if( mtorIdx > mtee ){
                        stuFlag[ area[exam][mtee]-1 ] = false;
                    }else if ( mtorIdx == mtee ){
                        stuFlag[ area[exam][mtee]-1 ] = false;
                        break;
                    }

                }
            }

            for (boolean b : stuFlag) {
                if( b == true){
                    answer++;
                }
            }
            changeBoolArrTrue(stuFlag);

        }
        return answer;
    }

    private void changeBoolArrTrue(boolean[] stuFlag) {
        Arrays.fill(stuFlag, Boolean.TRUE);
    }
}
