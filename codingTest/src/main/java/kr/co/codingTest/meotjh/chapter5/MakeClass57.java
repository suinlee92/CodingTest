package kr.co.codingTest.meotjh.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeClass57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String majorClass = sc.nextLine();
        String listenClasses = sc.nextLine();

        MakeClass57 makeClass = new MakeClass57();
        String result = makeClass.mySolution(majorClass, listenClasses);

        System.out.println(result);
    }

    public String mySolution(String majorClass, String listenClasses) {

        Queue<Character> queue = new LinkedList<>();
        String result = "YES";
        char[] listenClassesArr = listenClasses.toCharArray();
        majorClass.chars().forEach(o -> queue.offer( (char) o ) );

        for (char classOne : listenClassesArr) {

            if( queue.isEmpty() ){
                break;
            }

            if( classOne == queue.peek() ){
                queue.poll();
            }

        }

        if( queue.isEmpty() != true ){
            result = "NO";
        }
        return result;
    }
}
