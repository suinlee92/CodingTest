package kr.co.codingTest.suin.stackQueue;

import java.util.*;

public class SavePrincess {

    public static int who(int prince, int number) {

        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= prince; i++) {
            q.offer(i);
        }

        while(q.size() != 1) {
            count++;
            if(count != number) {
                q.offer(q.poll());
            }else {
                q.poll();
                count = 0;
            }
        }

        return q.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prince = scan.nextInt();
        int number = scan.nextInt();

        System.out.println("result : " + who(prince, number));
    }
}
