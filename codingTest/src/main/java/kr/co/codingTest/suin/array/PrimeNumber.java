package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class PrimeNumber {

    public static int primeNumber(int count) {
        int cnt = 0;
        int temp = 0;

        for(int i=2; i<count+1; i++) {
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    temp++;
                }
            }
            if(temp == 0) {
                cnt++;
            }
            temp = 0;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        System.out.println(primeNumber(count));
    }
}
