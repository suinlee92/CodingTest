package kr.co.codingTest.meotjh.chapter6;

import java.util.HashMap;
import java.util.Scanner;

public class DoubleCheck5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++ ){
            arr[i] = scanner.nextInt();
        }

        DoubleCheck5 dc = new DoubleCheck5();
        String flag = dc.findDouble(length, arr);

        System.out.println(flag);
    }

    public String findDouble(int length, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < length; i++ ){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        String flag = "U";
        for (Integer value : hm.values()) {
            if( !value.equals(1) ){
                flag = "D";
            }
        }
        return flag;
    }
}
