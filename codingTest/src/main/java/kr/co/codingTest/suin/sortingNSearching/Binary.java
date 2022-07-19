package kr.co.codingTest.suin.sortingNSearching;

import org.springframework.beans.factory.support.ScopeNotActiveException;

import java.util.Scanner;

public class Binary {

    public static void solution(int n) {

        if(n == 1) {
            System.out.print("1");
            return;
        }else {
            solution(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        solution(n);
    }
}
