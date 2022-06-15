package kr.co.codingTest.suin.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {

    public static int checkAnagram(char[] array1, char[] array2) {

        int count = 0, cnt = 0;
        int temp = array1.length - array2.length + 1;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : array2) {
            map.put(c, 0);
        }

        for(int i=0; i<temp; i++) {
            for(Character key : map.keySet()) {
                if(array1[i] == key) {
                    map.put(key, 1);
                }
            }
            cnt++;
            if(cnt == 3) {
                cnt = 0;
                i--;
                if(!map.containsValue(0)) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String array1 = scan.next();
        String array2 = scan.next();

        System.out.println("result : " + checkAnagram(array1.toCharArray(), array2.toCharArray()));
    }
}
