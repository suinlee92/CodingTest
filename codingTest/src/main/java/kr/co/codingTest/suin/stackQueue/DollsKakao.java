package kr.co.codingTest.suin.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DollsKakao {

    public static int checkRemove(int[][] board, int[] array) {

        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if(board[j][array[i] - 1] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(board[j][array[i] - 1]);
                    }else {
                        if(stack.peek() != board[j][array[i] - 1]) {
                            stack.push(board[j][array[i] - 1]);
                        }else {
                            result+=2;
                            stack.pop();
                        }
                    }
                    board[j][array[i] - 1] = 0;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        int k = scan.nextInt();
        int[] array = new int[k];

        for (int i = 0; i < k; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("result : " + checkRemove(board, array) );

    }
}
