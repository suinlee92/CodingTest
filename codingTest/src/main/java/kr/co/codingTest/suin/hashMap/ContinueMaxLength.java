package kr.co.codingTest.suin.hashMap;

import java.util.Scanner;

public class ContinueMaxLength {

    public static int maxLength(int[] array, int arrayCnt, int changeCnt) {

        int result = 0, lt = 0, count = 0, sum = 0;

        for(int rt=0; rt<arrayCnt; rt++) {
            if(array[rt] == 1) sum += array[rt];
            else count++;

            if(count > changeCnt) {
                while(array[lt] == 1) {
                    sum -= array[lt++];
                }
                count--;
                lt++;
            }
            if(sum > result) result = sum;
        }

        result = result + changeCnt;

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayCnt = scan.nextInt();
        int changeCnt = scan.nextInt();
        int[] array = new int[arrayCnt];

        for(int i=0; i<arrayCnt; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + maxLength(array, arrayCnt, changeCnt));
    }
}
