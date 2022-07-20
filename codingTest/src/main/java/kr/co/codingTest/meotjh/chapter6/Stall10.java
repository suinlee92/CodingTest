package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Stall10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = sc.nextInt();

        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int rslt = new Stall10().solution(length, count, arr);
        System.out.println(rslt);

    }

    public int solution(int length, int count, int[] arr){

        int answer = 0 ;
        int lt = 1;
        int rt = arr[length-1];
        while(lt<=rt){
            int mid = (lt + rt) / 2;
            if(count(arr,mid) >= count){
                answer = mid;
                lt = mid+1;
            }else{
                rt = mid-1;
            }
        }
        return answer;
    }

    public int count(int[] arr, int distance){
        int cnt =1;
        int temp = arr[0];
        for(int i =0 ; i<arr.length; i++){
            if(arr[i] - temp >= distance){
                cnt++;
                temp=arr[i];
            }
        }
        return cnt;

    }
}
