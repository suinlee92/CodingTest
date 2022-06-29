package kr.co.codingTest.suin.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Design {

    public static String checkDesign(char[] must, char[] all) {

        Queue<Character> q = new LinkedList<>();

        for(char c : all) {
            q.offer(c);
        }

        for(char c : must) {
                if(q.contains(c)) {
                    while(q.poll() != c);
                }else {
                    return "NO";
                }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String must = scan.next();
        String all = scan.next();

        System.out.println("result : " + checkDesign(must.toCharArray(), all.toCharArray()));
    }
}
