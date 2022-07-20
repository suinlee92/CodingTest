package kr.co.codingTest.meotjh.chapter7;

import java.util.Scanner;

public class Factorial3 {

    public int factorial(int num){

        if( num != 1){
            return num * factorial(num-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rslt = 1;

        Factorial3 facto = new Factorial3();
        int factorialRslt = facto.factorial(num);

        System.out.println("factorialRslt = " + factorialRslt);


    }
}
