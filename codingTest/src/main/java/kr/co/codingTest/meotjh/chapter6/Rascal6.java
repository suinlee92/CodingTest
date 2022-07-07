package kr.co.codingTest.meotjh.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rascal6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int stuLength = sc.nextInt();

        int[] stuArr = new int[stuLength];
        for(int i = 0; i < stuLength; i++ ){
            stuArr[i] = sc.nextInt();
        }

        Rascal6 rascal = new Rascal6();
        List<Integer> rsltList = rascal.findRascal(stuLength, stuArr);

        for (Integer integer : rsltList) {
            System.out.print(integer + " ");
        }

    }

    public List<Integer> findRascal(int stuLength, int[] stuArr) {
        int[] stuSorted = stuArr.clone();
        Arrays.sort( stuSorted );

        List<Integer> rsltList = new ArrayList<>();
        for(int i = 0; i < stuLength; i ++){
            if( stuArr[i] != stuSorted[i] ){
                rsltList.add(i+1);
            }
        }
        return rsltList;
    }
}
