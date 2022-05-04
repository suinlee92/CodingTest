package kr.co.codingTest.meotjh.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer nums = sc.nextInt();
        sc.nextLine();
        String primeListBefore = sc.nextLine();

        ReversePrime reversePrime = new ReversePrime();
        List<Integer> ReversePrimeList = reversePrime.gerReversePrimeList(nums, primeListBefore);

        for (Integer integer : ReversePrimeList) {
            System.out.print(integer + " ");
        }

    }

    public List<Integer> gerReversePrimeList(Integer nums, String demicalArrBefore) {

        String[] demicalArr = demicalArrBefore.split(" ");
        StringBuilder sb = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        boolean isPrime = false;

        for(int i = 0; i < nums; i ++ ){

            sb.setLength(0);
            Integer primeTarget = Integer.parseInt( sb.append( demicalArr[i] ).reverse().toString() );

            for( int j = 2 ; j < primeTarget ; j ++ ){

                if( ( primeTarget % j ) != 0 ){
                    isPrime = true;
                }else{
                    isPrime = false;
                    break;
                }
            }

            if( isPrime == true || primeTarget == 2 ){
                result.add(primeTarget);
                isPrime = false;
            }

        }
        return result;
    }
}
