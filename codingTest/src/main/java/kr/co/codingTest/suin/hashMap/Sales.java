package kr.co.codingTest.suin.hashMap;


import java.util.HashMap;
import java.util.Scanner;

public class Sales {

    public static int[] check(int day, int sales, int[] array) {

        int cnt = sales;
        int[] result = new int[sales];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sales; i++) {
            map.put(i, sales);
        }

        for(int lt = 0; lt<sales; lt++) {
            for(int i = lt; i<lt + sales; i++) {
                for(int j = i+1; j<lt+sales; j++) {
                    if(array[i] == array[j]) cnt--;
                }
            }
            result[lt] = cnt;
//            map.put(lt, cnt);
            cnt=sales;
        }



        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int sales = scan.nextInt();
        int[] array = new int[day];
        for(int i=0; i<day; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("result: " + check(day, sales, array));
    }
}
