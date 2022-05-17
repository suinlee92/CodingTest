package kr.co.codingTest.suin.array;

import java.util.Scanner;

public class Mentor {

//    public static int mentor(int[][] array, int student, int test) {
//
//        int temp1 = 0, temp2 = 0, index1 = 0, index2 = 0, cnt = 0;
//
//        for(int i=0; i<student; i++) {
//            for(int j=0; j<student-1; j++) {
//                for(int k=1; k<test; k++) {
//                    for(int r=0; r<student; r++) {
//                        temp1 = array[i][j];
//                        temp2 = array[i][j+1];
//                        if(temp1 == array[k][r]) {
//                            index1 = r;
//                        }else if (temp2 == array[k][r]) {
//                            index2 = r;
//                        }
//                    }
//                    if(index1 > index2) {
//                        break;
//                    }else if(k == test-1 && index1 > index2) {
//                        cnt++;
//                    }
//                }
//            }
//        }
//
//        return cnt;
//    }
    public static int mentor(int[][] array, int student, int test) {

        int answer = 0;

        for(int i=1; i<=student; i++) {
            for(int j=1; j<=student; j++) {
                int cnt = 0;
                for(int k=0; k<test; k++) {
                    int pi=0, pj=0;
                    for(int s=0; s<student; s++) {
                        if(array[k][s] == i) pi = s;
                        if(array[k][s] == j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == test) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int test = scan.nextInt();
        int[][] array = new int[test][student];

        for(int i=0; i<test; i++) {
            for(int j=0; j<student; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println("result : " + mentor(array, student, test));
    }
}
