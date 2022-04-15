package kr.co.codingTest.meotjh;
import java.util.Scanner;

public class DivideHalfEqual17 {


    public static void main(String[] args) {

        String target = new Scanner(System.in).next().toUpperCase();
        char[] targetToArr = target.toCharArray();
        Integer end = targetToArr.length - 1;
        String flag = "NO";

        for (int i = 0; i < targetToArr.length / 2; i++) {
            if (targetToArr[i] == targetToArr[end]) {
                flag = "YES";
                end -=1;
            }else{
                flag = "NO";
                break;
            }
        }

        System.out.println(flag);
    }

}