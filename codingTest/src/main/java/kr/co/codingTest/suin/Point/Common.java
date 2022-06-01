package kr.co.codingTest.suin.Point;

import java.util.*;

public class Common {

    //내꺼
    public static ArrayList<Integer> checkCommon(int[] arrayA, int[] arrayB) {

        ArrayList<Integer> result = new ArrayList<>();
        int temp = -1;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for(int i=0; i<arrayA.length; i++) {
            for(int j=temp+1; j<arrayB.length; j++) {
                if(arrayA[i] == arrayB[j]) {
                    result.add(arrayA[i]);
                    temp = j;
                    break;
                }
            }
        }

        return result;
    }

    //강사꺼
//    public static ArrayList<Integer> checkCommon(int[] arrayA, int[] arrayB) {
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        Arrays.sort(arrayA);
//        Arrays.sort(arrayB);
//
//        int p1=0, p2=0;
//
//        while(p1<arrayA.length && p2<arrayB.length) {
//            if(arrayA[p1] == arrayB[p2]) {
//                result.add(arrayA[p1++]);
//                p2++;
//            }else if(arrayA[p1] < arrayB[p2]) p1++;
//            else p2++;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countA = scan.nextInt();
        int[] arrayA = new int[countA];
        for(int i=0; i<countA; i++) {
            arrayA[i] = scan.nextInt();
        }

        int countB = scan.nextInt();
        int[] arrayB = new int[countB];
        for(int i=0; i<countB; i++) {
            arrayB[i] = scan.nextInt();
        }

        System.out.println("result : " + checkCommon(arrayA, arrayB));
    }
}
