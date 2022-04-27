package kr.co.codingTest.meotjh.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer gameNumber = sc.nextInt();
        sc.nextLine();
        Object[] playerA = Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e)).toArray();
        Object[] playerB = Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e)).toArray();

        RockPaperScissors23 rps = new RockPaperScissors23();
        List<String> gameResult = rps.getGameRslt(gameNumber, playerA, playerB);

        for (String s : gameResult) {
            System.out.println(s);
        }


    }

    public List<String> getGameRslt(Integer gameNumber, Object[] playerA, Object[] playerB) {
        List<String> gameResult = new ArrayList<String>();
        Integer tempNumA = null;
        Integer tempNumB = null;

        for(int i = 0; i < gameNumber; i ++){

            tempNumA = (Integer) playerA[i];
            tempNumB = (Integer) playerB[i];

                if( tempNumA.equals(tempNumB+1) || tempNumA.equals( tempNumB -2 ) ){
                    gameResult.add("A");
                }else if ( tempNumA.equals(tempNumB -1) || tempNumA.equals(tempNumB + 2)){
                    gameResult.add("B");
                }else{
                    gameResult.add("D");
                }


        }
        return gameResult;
    }
}
