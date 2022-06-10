package kr.co.codingTest.meotjh.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class CraneGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mapWidHeit = sc.nextInt();

        int[][] craneItem = new int[mapWidHeit][mapWidHeit];
        for( int i = 0 ; i < mapWidHeit ; i ++ ){
            for( int j = 0 ; j < mapWidHeit ; j ++){
                craneItem[j][i] = sc.nextInt();
            }
        }

        int craneMovNum = sc.nextInt();
        int[] craneMove = new int[craneMovNum];
        for( int i = 0; i < craneMovNum ; i ++){
            craneMove[i] = sc.nextInt();
        }

        // logic start
        CraneGame craneGame = new CraneGame();
        int result = craneGame.resultCraneGame(craneItem, craneMovNum, craneMove);

        System.out.println(result);
    }

    public int resultCraneGame(int[][] craneItem, int craneMovNum, int[] craneMove) {
        int locItem = -1;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < craneMovNum; i ++){

            int craneLoc = craneMove[i];
            int[] locItems = craneItem[craneLoc-1];

            for(int j = 0 ; j < locItems.length ; j++ ){
                locItem = locItems[j];
                if( locItem != 0 ){

                    if( stack.isEmpty() == false && locItem == stack.peek() ){
                        result++;
                        stack.pop();
                    }else{
                        stack.push(locItem);
                    }

                    locItems[j] = 0;
                    break;
                }
            }
        }
        return result*2;
    }
}
