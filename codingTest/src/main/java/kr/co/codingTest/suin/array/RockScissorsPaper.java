package kr.co.codingTest.suin.array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockScissorsPaper {

    public static ArrayList<String> checkWinner(int[] one, int[] two) {

        ArrayList<String> result = new ArrayList<>();

        for(int i=0; i<one.length; i++) {

            switch (one[i]) {
                case 1:
                    if(two[i] == 1) {
                        result.add("D");
                    }else if(two[i] == 2) {
                        result.add("B");
                    }else {
                        result.add("A");
                    }
                    break;
                case 2:
                    if(two[i] == 2) {
                        result.add("D");
                    }else if(two[i] == 1) {
                        result.add("A");
                    }else {
                        result.add("B");
                    }
                    break;
                case 3:
                    if(two[i] == 3) {
                        result.add("D");
                    }else if(two[i] == 1) {
                        result.add("B");
                    }else {
                        result.add("A");
                    }
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] one = new int[cnt];
        int[] two = new int[cnt];
        for(int i=0; i<cnt; i++) {
            one[i] = scan.nextInt();
        }
        for(int i=0; i<cnt; i++) {
            two[i] = scan.nextInt();
        }

        ArrayList<String> result = new ArrayList<>();
        result = checkWinner(one, two);
        for(String winner : result) {
            System.out.println(winner);
        }
    }
}
