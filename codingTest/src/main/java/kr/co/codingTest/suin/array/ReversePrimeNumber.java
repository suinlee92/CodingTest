package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class ReversePrimeNumber {

    public static String reverseNum(int[] numArray) {

        StringBuilder string = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int reverseNum, temp = 0;

        for (int i=0; i<numArray.length; i++) {
            reverseNum = Integer.parseInt(string.append(numArray[i]).reverse().toString());

            for(int j=2; j<reverseNum; j++) {
                if(reverseNum%j == 0) temp++;
            }

            if(temp == 0 && reverseNum != 1) result.append(reverseNum).append(" ");
            temp = 0;
            string.setLength(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] numArray = new int[count];
        for(int i=0; i<count; i++) {
            numArray[i] = scan.nextInt();
        }
        System.out.println(reverseNum(numArray));
    }
}
