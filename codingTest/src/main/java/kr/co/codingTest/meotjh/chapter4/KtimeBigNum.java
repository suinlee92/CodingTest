package kr.co.codingTest.meotjh.chapter4;

import java.util.*;

public class KtimeBigNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int targetK = sc.nextInt();
        int sumBoundary = 3;

        int[] numArr = new int[nums];
        for(int i = 0 ; i < nums ; i++){
            numArr[i]  = sc.nextInt();
        }


        KtimeBigNum ktimeBigNum = new KtimeBigNum();
        int rslt = ktimeBigNum.getRslt(nums, targetK, numArr);

        System.out.println(rslt);

    }

    public int getRslt(int nums, int targetK, int[] numArr) {

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i< nums; i++){
            for(int j = i+1; j< nums; j++){
                for(int l = j+1; l< nums; l++){
                    treeSet.add(numArr[i]+ numArr[j]+ numArr[l]);
                }
            }
        }

        int cnt = 0;
        int rslt = -1;
        for (Integer integer : treeSet) {
            cnt++;
            if(cnt == targetK){
                rslt = integer;
            }
        }
        return rslt;
    }
}
