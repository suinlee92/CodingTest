package kr.co.codingTest.meotjh.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cipher112 {

    public static void main(String[] args) {
        Cipher112 cipher = new Cipher112();
        Scanner sc = new Scanner(System.in);
        Integer targetLen = sc.nextInt();
        String target = sc.next();
        String sb = cipher.getSolution(targetLen, target);

        System.out.println(sb);

    }

    public String getSolution(Integer targetLen, String target) {
        target = getCipherToBinary(target);
        List<String> targetList = getTargetList(targetLen, target);

        StringBuilder sb = new StringBuilder();
        for (String s : targetList) {
            int temp = Integer.parseInt(s,2);
            sb.append( Character.toString( (char) temp ) );
        }
        return sb.toString();
    }

    private List<String> getTargetList(Integer targetLen, String target) {
        List<String> targetList = new ArrayList<>();
        String tempValue = null;
        for(int i = 0; i < targetLen; i++ ){
            tempValue = target.substring(7*i, 7*i + 7);
            targetList.add(tempValue);
        }
        return targetList;
    }

    private String getCipherToBinary(String target) {
        return target.replace("#", "1").replace("*", "0");
    }
}
