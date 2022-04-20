package kr.co.codingTest.meotjh;

import java.util.Scanner;
public class DivideHalfEqualSentence18 {

    String pattern = "[^a-z]";

    public String getFlag() {

        String target = new Scanner(System.in)
                .nextLine()
                .toLowerCase()
                .replaceAll(pattern, "");

        StringBuilder sb = new StringBuilder(target);
        String flag = sb.reverse().equals(sb)? "YES" : "NO";
        return flag;

    }

    public static void main(String[] args) {
        DivideHalfEqualSentence18 dh = new DivideHalfEqualSentence18();
        String answer = dh.getFlag();
        System.out.println("answer = " + answer);

    }

}
