package kr.co.codingTest.meotjh.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firArrNums = sc.nextInt();
        int[] firArr = new int[firArrNums];
        for(int i = 0 ; i < firArrNums ; i ++){
            firArr[i] = sc.nextInt();
        }

        int secArrNums = sc.nextInt();
        int[] secArr = new int[secArrNums];
        for(int i = 0 ; i < secArrNums ; i ++){
            secArr[i] = sc.nextInt();
        }

        DuplicateArray duplicateArray = new DuplicateArray();
        List<Integer> result = duplicateArray.getDuplicateIdxList(firArr, secArr);

        for (Integer integer : result) {
            System.out.println("integer = " + integer);
        }


    }

    public List<Integer> getDuplicateIdxList(int[] firArr, int[] secArr) {

        int[] thirArr = sumTwoArr(firArr, secArr);
        Arrays.sort(thirArr);

        return addListDulicateIdx(thirArr);
    }

    private List<Integer> addListDulicateIdx(int[] thirArr) {

        int temp = -1;
        List<Integer> result = new ArrayList<>();

        for (int idx : thirArr) {

            if( temp == idx ){
                result.add(temp);
                temp = -1;
            }else{
                temp = idx;
            }

        }

        return result;
    }

    private int[] sumTwoArr(int[] firArr, int[] secArr) {

        int[] thirArr = new int[firArr.length + secArr.length];

        System.arraycopy(firArr, 0, thirArr, 0, firArr.length);
        System.arraycopy(secArr, 0, thirArr, firArr.length, secArr.length);

        return thirArr;
    }
}
