package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class Factory {

    public static int solution(int n) {
        if(n == 1) {
            return 1;
        }else {
          return n * solution(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("result : " + solution(n));
    }
}
