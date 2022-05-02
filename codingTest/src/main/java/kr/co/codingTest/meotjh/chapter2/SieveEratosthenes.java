package kr.co.codingTest.meotjh.chapter2;

import java.util.*;

public class SieveEratosthenes {

    public static void main(String[] args) {

        Integer number = new Scanner(System.in).nextInt();
        SieveEratosthenes se = new SieveEratosthenes();
        Integer cnt = se.getDemical(number);
        System.out.println(cnt);


    }

    public Integer getDemical(Integer number) {
        Double rootNumber = Math.sqrt(number);
        Long sqrtNum = Math.round(rootNumber);

        List<Boolean> nums = new ArrayList<Boolean>(Arrays.asList(new Boolean[number]));
        Collections.fill(nums, Boolean.TRUE);

        Integer cnt = 0;

        nums.set(0,false);
        for( int i = 2 ; i < sqrtNum ; i++ ){

            for(int j = i; j < number; j = j + 1){

                if( ( j + 1 )%i == 0 && ( nums.get(j) == true ) && ( ( j + 1 ) != i) ){
                    nums.set(j, false);
                }

            }
        }


        for (Boolean num : nums) {

            if( num == true){
                cnt++;
            }
        }
        return cnt;
    }
}
