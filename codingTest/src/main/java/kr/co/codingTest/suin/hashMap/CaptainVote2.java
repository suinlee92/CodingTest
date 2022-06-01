package kr.co.codingTest.suin.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CaptainVote2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        String array = scan.next();

        System.out.println("result : " + checkVote(student, array));

    }

    public static char checkVote(int student, String array) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char v : array.toCharArray()) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        int max = 0;
        char result = ' ';

        for(char k : map.keySet()) {
            if(map.get(k) > max) {
                max = map.get(k);
                result = k;
            }
        }

        return result;
    }
}
