package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class BigNumber {

    public static String printBigNumber(int[] numbers) {

        StringBuilder result = new StringBuilder();

        for(int i=0; i<numbers.length; i++) {
            if(i == 0) {
                result.append(numbers[i]);
            }else if(i == numbers.length-1) {
                break;
            }else {
                if(numbers[i] < numbers[i+1]) {
                    result.append(" ").append(numbers[i+1]);
                }
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] numbers = new int[cnt];
        for(int i=0; i<cnt; i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println(printBigNumber(numbers));
    }
}
