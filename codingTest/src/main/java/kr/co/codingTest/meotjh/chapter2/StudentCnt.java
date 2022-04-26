package kr.co.codingTest.meotjh.chapter2;

import java.util.Scanner;

public class StudentCnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer studentCnt = sc.nextInt();
        sc.nextLine();
        String studentHeits = sc.nextLine();

        StudentCnt stuCnt = new StudentCnt();
        Integer result = stuCnt.getVisibleStudent(studentCnt, studentHeits);

        System.out.println(result);
    }

    public Integer getVisibleStudent(Integer studentCnt, String studentHeits) {
        String[] stuHeitArr = studentHeits.split(" ");
        Integer result = 1;
        int tallestStu = Integer.parseInt(stuHeitArr[0]);
        for(int i = 0; i < studentCnt; i++ ){
            int studentHeit = Integer.parseInt( stuHeitArr[i]);
            if( studentHeit > tallestStu ){
                tallestStu = studentHeit;
                result++;
            }

        }

        return result;
    }
}
