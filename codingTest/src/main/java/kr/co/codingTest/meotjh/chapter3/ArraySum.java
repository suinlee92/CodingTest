package kr.co.codingTest.meotjh.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer firArrayNums = sc.nextInt();
        Integer[] firArray = new Integer[firArrayNums];
        for( int i = 0 ; i < firArrayNums ; i ++ ){
            firArray[i] = sc.nextInt();
         }

        Integer secArrayNums = sc.nextInt();
        Integer[] secArray = new Integer[secArrayNums];
        for( int i = 0 ; i < secArrayNums ; i ++ ){
            secArray[i] = sc.nextInt();
        }

        ArraySum arraySum = new ArraySum();
        Integer[] thrdArray = arraySum.sumArrays(firArrayNums, firArray, secArrayNums, secArray);

        for (Integer integer : thrdArray) {
            System.out.print( integer + " ");
        }


    }

    public Integer[] sumArrays(Integer firArrayNums, Integer[] firArray, Integer secArrayNums, Integer[] secArray) {
        Integer thrdArrayNums = firArrayNums + secArrayNums;
        Integer[] thrdArray = new Integer[thrdArrayNums];
        for( int i = 0 ; i < thrdArrayNums ; i ++ ){

            if( i < firArrayNums){
                thrdArray[i] = firArray[i];
            }else{
                thrdArray[i] = secArray[i - firArrayNums];
            }
        }

        Arrays.sort(thrdArray);

        return thrdArray;
    }
}
