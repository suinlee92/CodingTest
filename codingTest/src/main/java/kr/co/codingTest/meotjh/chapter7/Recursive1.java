package kr.co.codingTest.meotjh.chapter7;

import java.util.Scanner;

public class Recursive1 {

    public void printRuc(int length, int number){
        if( number <= length ){
            System.out.print(number + " ");
            number++;
            printRuc(length,number);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int number = 1;

        Recursive1 recursive = new Recursive1();
        recursive.printRuc(length, number);

    }
}
