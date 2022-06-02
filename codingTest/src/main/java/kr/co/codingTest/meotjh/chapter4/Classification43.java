package kr.co.codingTest.meotjh.chapter4;

import java.util.*;

public class Classification43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();
        int boundary = sc.nextInt();

        int[] numArr = new int[nums];
        for(int i = 0 ; i < nums ; i ++){
            numArr[i] = sc.nextInt();
        }

        Classification43 classification43 = new Classification43();
        ArrayList<Integer> answer = classification43.classifyNums(nums, boundary, numArr);

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }

    public ArrayList<Integer> classifyNums(int nums, int boundary, int[] numArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i< boundary -1; i++){
            HM.put(numArr[i], HM.getOrDefault(numArr[i], 0)+1);
        }

        int lt = 0;
        for(int rt = boundary -1; rt < nums; rt ++){
            HM.put(numArr[rt], HM.getOrDefault(numArr[rt], 0)+1);
            answer.add(HM.size());

            HM.put(numArr[lt], HM.get(numArr[lt])-1);
            if(HM.get(numArr[lt])==0) HM.remove(numArr[lt]);

            lt++;
        }
        return answer;
    }
}
