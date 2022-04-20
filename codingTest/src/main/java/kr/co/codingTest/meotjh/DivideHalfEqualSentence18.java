package kr.co.codingTest.meotjh;

import java.util.Scanner;
public class DivideHalfEqualSentence18 {

    String pattern = "[^a-z]";

    public String getFlag(String target) {

        String solution = target
                            .toLowerCase()
                            .replaceAll(pattern, "");

        StringBuilder sb = new StringBuilder(solution);
        String flag = sb.reverse().toString().equals(solution.toString()) ? "YES" : "NO";
        return flag;

    }

    public static void main(String[] args) {
        DivideHalfEqualSentence18 dh = new DivideHalfEqualSentence18();
        String target = new Scanner(System.in).nextLine();
        String answer = dh.getFlag(target);
        System.out.println("answer = " + answer);

    }

}
