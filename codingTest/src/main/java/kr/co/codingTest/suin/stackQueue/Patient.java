package kr.co.codingTest.suin.stackQueue;

import java.util.*;

public class Patient {
    public static int checkTreatment(int[] array, int patient) {

        Queue<PatientObj> q = new LinkedList<>();
        int result = 0, key = -1, max = -1;

        for (int i = 0; i < array.length; i++) {
            q.offer(new PatientObj(i, array[i]));
        }

        Arrays.sort(array);

        while(key != patient) {
            max = array[q.size() -1];
                System.out.println("test" + q.peek().getValue());
            if(q.peek().getValue() == max) {
                key = q.poll().getKey();
                result++;
            }else {
                q.offer(q.poll());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int patients = scan.nextInt();
        int patient = scan.nextInt();
        int[] array = new int[patients];

        for (int i = 0; i <patients ; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + checkTreatment(array, patient));
    }
}
