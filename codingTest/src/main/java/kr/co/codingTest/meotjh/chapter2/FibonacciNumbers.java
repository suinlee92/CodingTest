package kr.co.codingTest.meotjh.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {

        //i = ( i - 1 ) + ( i -2 )  -> 피보나치수열
        Scanner sc = new Scanner(System.in);

        Integer numbers = sc.nextInt();

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        List<Integer> fiboNums = fibonacciNumbers.calFiboNums(numbers);

        for (Integer fiboNum : fiboNums) {
            System.out.print( fiboNum+ " ");
        }



    }

    public List<Integer> calFiboNums(Integer numbers) {

        List<Integer> fiboNums = new ArrayList<>();
        for(int fiboIdx = 0; fiboIdx < numbers; fiboIdx ++ ){

            if( fiboIdx < 2){
                fiboNums.add( 1 );
            }else{
                fiboNums.add( fiboNums.get( fiboIdx - 2 ) + fiboNums.get( fiboIdx - 1 ) );
            }

        }

        return fiboNums;

    }

}
