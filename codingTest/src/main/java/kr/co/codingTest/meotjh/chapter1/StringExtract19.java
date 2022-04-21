package kr.co.codingTest.meotjh.chapter1;

import java.util.Scanner;

public class StringExtract19 {

    public static void main(String[] args) {
        StringExtract19 se = new StringExtract19();
        Integer targetNum = se.getSolution( new Scanner(System.in).next() );
        System.out.println(targetNum);
    }

    public Integer getSolution(String target) {
        return Integer.parseInt( target.replaceAll("[a-zA-Z]", "") );
    }
}
