package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[length];
        for( int i = 0 ; i<length ; i++ ){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(target, 0, length, arr);

        System.out.println(result+1);

        //8 32
        //23 87 65 12 57 32 99 81

    }

    public int binarySearch(int key, int low, int high, int[] arr) {
        Arrays.sort(arr);
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                // 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색
                return binarySearch(key ,low, mid-1, arr);
            } else {
                // 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색
                return binarySearch(key, mid+1, high, arr);
            }
        }

        return -1; // 탐색 실패
    }
}
