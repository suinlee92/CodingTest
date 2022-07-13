package kr.co.codingTest.suin.sortingNSearching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    public static int count(int[] array, int capacity) {

        int cnt = 1;
        int sum = 0;

        for (int music: array) {
            if(sum+music > capacity) {
                cnt++;
                sum = music;
            }else {
                sum+=music;
            }
        }

        return cnt;
    }

    public static int decide(int n, int m, int[] array) {

        int result = 0;
        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();
        int mid = 0;

        while(lt <= rt) {
            mid = (lt+rt)/2;
            if(count(array, mid) <= m) {
                result = mid;
                rt = mid -1;
            }else {
                lt = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + decide(n, m, array));
    }
}
