package kr.co.codingTest.meotjh.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo9 {

    private int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;

        for(int idx : arr){
            if( sum + idx > capacity){
                cnt++;
                sum=idx;
            }else{
                sum += idx;
            }
        }
        return cnt;

    }

    public int solution(int length , int target , int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid= ( lt + rt )/2;
            if(count(arr,mid) <= target){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid +1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MusicVideo9 mv = new MusicVideo9();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr= new int[length];
        for(int i = 0 ; i < length ; i ++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(mv.solution(length,target,arr));
    }
}
