package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Fibonacci {

    public static String fibonacci(int count) {

        int[] array = new int[count];
        array[0] = 1;
        array[1] = 1;
        StringBuilder result = new StringBuilder().append(array[0]).append(" ").append(array[1]);

        for(int i=2; i<count; i++) {
            array[i] = array[i-2] + array[i-1];
            result.append(" ").append(array[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        System.out.println(fibonacci(count));
    }
}
