package kr.co.codingTest.suin.hashMap;

import java.util.Scanner;

public class ContinueSum {

    public static int sumCount(int[] array, int count, int n) {

        int lt = 0, result = 0, sum = 0;

        for(int rt=0; rt<count; rt++) {
            sum += array[rt];
            if(sum == n) result++;
            while(sum >= n) {
                sum -= array[lt++];
                if(sum == n) result++;
            }
        }

        return result;
    }


        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        //짝수
        if(n%2 == 0) {
            count = n/2;
        //홀수
        }else {
            count = (n/2) + 1;
        }

        int[] array = new int[count];
        for(int i=0; i<count; i++) {
            array[i] = i+1;
        }

        System.out.println("result : " + sumCount(array, count, n));
    }
}
