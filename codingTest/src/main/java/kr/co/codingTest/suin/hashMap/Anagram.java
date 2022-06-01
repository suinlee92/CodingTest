package kr.co.codingTest.suin.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();

        System.out.println("result : " + checkAnagram(first, second));
    }

    public static String checkAnagram(String first, String second) {

        HashMap<Character, Integer> array1 = new HashMap<>();
        HashMap<Character, Integer> array2 = new HashMap<>();

        for(char c : first.toCharArray()) {
            array1.put(c, array1.getOrDefault(c, 0) + 1);
        }
        for(char c : second.toCharArray()) {
            array2.put(c, array2.getOrDefault(c, 0) + 1);
        }

        for(char key : array1.keySet()) {
            if(array1.get(key) != array2.get(key)) {
                return "NO";
            }
        }

        return "YES";
    }
}
