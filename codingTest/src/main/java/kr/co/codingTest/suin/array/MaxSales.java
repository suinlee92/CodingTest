package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class MaxSales {

    public static int maxSales(int[] sales, int continuity)  {

        int max = 0;
        int day = continuity -1;

        for(int i=0; i<sales.length-day; i++) {
            if(max < sales[i] + sales[i+1] + sales[i+2]) max = sales[i] + sales[i+1] + sales[i+2];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int continuity = scan.nextInt();
        int[] sales = new int[day];

        for(int i=0; i<day; i++) {
            sales[i] = scan.nextInt();
        }

        System.out.println("result : " + maxSales(sales, continuity));
    }
}
