package kr.co.codingTest.suin.sortingNSearching;

import java.util.Scanner;

public class LRU {

    public static String LRUCheck(int n, int m, int[] work) {

        int[] cache = new int[n];
        boolean exist = false;
        int temp = 0;

        for (int i = 0; i < m; i++) {
            for(int j=0; j<n; j++) {
                if(work[i] == cache[j]) {
                    temp = j;
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                for (int j = n-1; j > 0; j--) {
                    cache[j] = cache[j-1];
                }
            }else {
                for(int j = temp; j > 0; j--) {
                    cache[j] = cache[j-1];
                }
            }
            cache[0] = work[i];
            exist = false;
        }

        StringBuilder result = new StringBuilder();

        for (int i:cache) {
            result.append(i);
            result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] work = new int[m];

        for (int i = 0; i < m; i++) {
            work[i] = scan.nextInt();
        }

        System.out.println("result : " + LRUCheck(n, m, work));
    }

}
