package kr.co.codingTest.meotjh.chapter2;

import java.util.*;

public class BigNum21 {

    public static void main(String[] args) {
        BigNum21 bigNum = new BigNum21();
        Scanner sc = new Scanner(System.in);

        Integer length = sc.nextInt();
        sc.nextLine();
        String targetStr = sc.nextLine();

        List<Integer> solution = bigNum.getIntegers(length, targetStr);
        solution.stream().forEach( System.out::print );
        
    }

    public List<Integer> getIntegers(Integer length, String targetStr) {
        List<Integer> target = convertIntStr(targetStr);

        List<Integer> solution = new ArrayList<>();
        solution.add(target.get(0));

        for(int i = 1; i < length; i++ ){

            if( target.get(i) > target.get(i-1) ){
                solution.add( target.get(i) );
            }
        }
        return solution;
    }

    private List<Integer> convertIntStr(String targetStr) {
        List<Integer> target = new ArrayList<>();
        Arrays.stream(targetStr.split(" ")).forEach(value-> target.add( Integer.parseInt( value )) );
        return target;
    }
}