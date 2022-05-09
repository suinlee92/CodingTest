package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Grade {

    public static String checkGrade(int[] gradeArray) {

        StringBuilder result = new StringBuilder();
        int[] resultArray = new int[gradeArray.length];
        int count = 0;

        //5등으로 모두 세팅
        for (int i=0; i<resultArray.length; i++) {
            resultArray[i] = 5;
        }

        for(int i=0; i<gradeArray.length; i++) {
            for(int j=i+1; j<gradeArray.length; j++) {
                //index 하나 기준으로 나보다 점수 낮은 사람 카운트
                if(gradeArray[i] > gradeArray[j]) {
                    count++;
                //동점인 경우에 두명 모두 등수 1씩 앞으로 당기기    
                }else if(gradeArray[i] == gradeArray[j]) {
                    resultArray[i] -= 1;
                    resultArray[j] -= 1;
                }else {
                    resultArray[j] -= 1;
                }
            }
            //나보다 낮은사람 카운트된거 5등에서 빼기
            result.append(resultArray[i]-count).append(" ");
            count = 0;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] gradeArray = new int[count];

        for(int i=0; i<count; i++) {
            gradeArray[i] = scan.nextInt();
        }

        System.out.println(checkGrade(gradeArray));
    }
}
