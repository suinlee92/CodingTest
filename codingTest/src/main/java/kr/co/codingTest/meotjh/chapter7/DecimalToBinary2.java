package kr.co.codingTest.meotjh.chapter7;

import java.util.Scanner;

public class DecimalToBinary2 {

    public String deToBi(int decimal ,StringBuilder sb){

        if(decimal != 0){
            int binary = decimal % 2;
            sb.append(binary);
            deToBi(decimal/2, sb);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        DecimalToBinary2 decimalToBinary = new DecimalToBinary2();

        StringBuilder sb = new StringBuilder();
        String binaryNum = decimalToBinary.deToBi(decimal, sb);

    }
}
