package kr.co.codingTest.suin.sortingNSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Stable {

    public static int count(int[] array, int mid) {

        int count = 1;
        int ep = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]-ep >= mid) {
                ep = array[i];
                count++;
            }
        }

        return count;
    }

    public static int solution(int n, int m, int[] array) {

        int answer = 0;
        int lt = 1;
        Arrays.sort(array);
        int rt = array[n-1];

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(array, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            }else {
                rt = mid - 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("result : " + solution(n, m, array));
    }
}
