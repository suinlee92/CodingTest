package kr.co.codingTest.meotjh.chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String anaFir = sc.nextLine();
        String anaSec = sc.nextLine();

        Anagram42 anagram42 = new Anagram42();
        String rslt = anagram42.getSolution(anaFir, anaSec);

        System.out.println(rslt);

    }

    public String getSolution(String anaFir, String anaSec) {

        HashMap<Character, Integer> hashFir = new HashMap<>();
        HashMap<Character, Integer> hashSec = new HashMap<>();

        for (char c : anaFir.toCharArray()) {
            hashFir.put(c, hashFir.getOrDefault(c,0)+1);
        }

        for (char c : anaSec.toCharArray()) {
            hashSec.put(c, hashSec.getOrDefault(c,0)+1);
        }

        String rslt = "NO";
        for (Character key : hashFir.keySet()) {

            if(hashSec.containsKey(key)){
                Integer valueSec = hashSec.get(key);
                Integer valueFir = hashFir.get(key);

                rslt = valueFir.equals(valueSec) ? "YES": "NO";
                if( rslt.equals("NO") ){
                    break;
                }
            }else{
                break;
            }
        }
        return rslt;
    }
}
