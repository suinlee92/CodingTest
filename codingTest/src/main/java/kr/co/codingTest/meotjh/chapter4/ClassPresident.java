package kr.co.codingTest.meotjh.chapter4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();
        String classData = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        char[] chars = classData.toCharArray();

        for (Character aChar : chars) {

            if (map.get(aChar) == null) {
                map.put(aChar, 1);
            } else {
                //Integer temp = map.get(aChar) +1 ;
                map.put(aChar, map.get(aChar) + 1);
            }
        }

        Character rslt = Collections.max(map.entrySet(), HashMap.Entry.comparingByValue()).getKey();

        System.out.println(rslt);


    }
}
