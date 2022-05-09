package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class OX {

    public static int checkScore(int[] quizArray) {

        int bonus = 0, score = 0;

        if(quizArray[0] == 1) {
            bonus = 1;
            score += bonus;
        }

        for (int i=1; i<quizArray.length; i++) {
            if(quizArray[i-1] == 1 && quizArray[i] == 1) {
                bonus++;
            }else if(quizArray[i-1] == 0 && quizArray[i] == 1){
                bonus = 1;
            }else {
                bonus = 0;
            }
            score += bonus;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quizCnt = scan.nextInt();
        int[] quizArray = new int[quizCnt];

        for(int i=0; i<quizCnt; i++) {
            quizArray[i] = scan.nextInt();
        }
        System.out.println(checkScore(quizArray));
    }
}
