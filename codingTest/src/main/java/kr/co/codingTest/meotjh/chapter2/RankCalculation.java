package kr.co.codingTest.meotjh.chapter2;

import java.util.Scanner;

public class RankCalculation {

    public static void main(String[] args) {

        /*
        input
         */
        Scanner sc = new Scanner(System.in);
        Integer rankNums = sc.nextInt();
        sc.nextLine();
        String[] ranks = sc.nextLine().split(" ");

        /*
        logic
         */
        RankCalculation ck = new RankCalculation();
        Integer[] results = ck.calRank(rankNums, ranks);

        /*
        out
         */
        for (Integer result : results) {
            System.out.print(result + " ");
        }
    }

    public Integer[] calRank(Integer rankNums, String[] ranks) {
        Integer[] results = new Integer[rankNums];

        //1. 하나 선택
        //2. 돌면서 그것보다 큰거 갯수 찾기
        //3. 그거 넣기
        Integer temp;
        Integer rank = 1;
        for(int i = 0; i < rankNums; i ++){

            temp = Integer.parseInt( ranks[i] );

            for(int j = 0; j < rankNums; j ++){

                if( temp < Integer.parseInt( ranks[j] ) ){
                    rank++;
                }

            }

            results[i] = rank;
            rank = 1;
        }
        return results;
    }
}
