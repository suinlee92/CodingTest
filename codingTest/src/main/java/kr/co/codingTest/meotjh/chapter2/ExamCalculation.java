package kr.co.codingTest.meotjh.chapter2;

import java.util.Scanner;

public class ExamCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer exNums = sc.nextInt();
        sc.nextLine();
        String[] exCorrects = sc.nextLine().split(" ");


        ExamCalculation ec = new ExamCalculation();
        Integer result = ec.calExamRslt(exNums, exCorrects);

        System.out.println(result);
    }

    public Integer calExamRslt(Integer exNums, String[] exCorrects) {
        Integer exCorrect =0;
        Integer result = 0;
        Integer temp = 0;
        for(int i = 0; i < exNums; i++ ){
            exCorrect = Integer.parseInt( exCorrects[i] );

            if( exCorrect == 1 ){
                temp ++;
            }else{
                temp = 0;
            }
            result = result + temp;

        }
        return result;
    }
}
