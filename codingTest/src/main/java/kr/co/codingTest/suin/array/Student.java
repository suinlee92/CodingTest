package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Student {

    public static int count(int[] high) {
        int count = 1;
        int highest = high[0];

        for(int i=1; i<high.length; i++) {

            if(highest < high[i]){
                highest = high[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] high = new int[cnt];
        for(int i=0; i<cnt; i++){
            high[i] = scan.nextInt();
        }
        System.out.println(count(high));

    }
}
