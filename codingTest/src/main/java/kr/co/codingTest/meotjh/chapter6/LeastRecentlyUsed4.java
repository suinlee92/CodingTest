package kr.co.codingTest.meotjh.chapter6;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LeastRecentlyUsed4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cacheNums = sc.nextInt();
        int dataLength = sc.nextInt();

        int[] dataArr = new int[dataLength];
        for(int i = 0 ; i < dataLength ; i ++){
            dataArr[i] = sc.nextInt();
        }

        LeastRecentlyUsed4 lru = new LeastRecentlyUsed4();
        int[] cacheArr = lru.calculateLRU(cacheNums, dataLength, dataArr);

        for (int value : cacheArr) {
            System.out.print(value + " ");
        }


    }

    public int[] calculateLRU(int cacheNums, int dataLength, int[] dataArr) {
        int[] cacheArr = new int[cacheNums];
        for(int i = 0; i < dataLength; i ++){
            int data = dataArr[i];
            int idx = IntStream.range(0, cacheArr.length)
                    .filter(v -> data == cacheArr[v])
                    .findFirst()
                    .orElse(-1);

            int temp0 = data;
            int temp1 = 0;
             if(idx != -1){
                 cacheArr[idx] = 0;
                 for( int j = 0 ; j <= idx ; j++){
                     temp1 = cacheArr[j];
                     cacheArr[j] = temp0;
                     temp0 = temp1;
                 }
             }else{
                 for(int j = 0; j < cacheNums; j ++){
                     temp1 = cacheArr[j];
                     cacheArr[j] = temp0;
                     temp0 = temp1;
                 }
             }
        }
        return cacheArr;
    }


}
