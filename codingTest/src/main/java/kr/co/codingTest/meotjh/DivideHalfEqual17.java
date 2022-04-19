package kr.co.codingTest.meotjh;
import java.util.Scanner;

public class DivideHalfEqual17 {


    public static void main(String[] args) {

        DivideHalfEqual17 dh = new DivideHalfEqual17();
        String target = new Scanner(System.in).next().toUpperCase();
        String flag = dh.getSolution(target);
        System.out.println(flag);
    }

    public String getSolution(String target) {
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
        return flag;
    }

}