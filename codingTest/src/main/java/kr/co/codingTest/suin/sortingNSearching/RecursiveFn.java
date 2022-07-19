package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class RecursiveFn {

    public static void solution(int n) {
        if(n == 0) {
            return;
        }else {
            solution(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        solution(n);
    }
}
