package kr.co.codingTest.meotjh.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class FindPeak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer areaNum = sc.nextInt();
        sc.nextLine();
        int[][] area = new int[areaNum][areaNum];
        for( int i = 0 ; i < areaNum ; i ++ ){
            int[] oneRow = Arrays.stream( sc.nextLine().split(" ") )
                    .mapToInt(Integer::parseInt)
                    .toArray();
            area[i] = oneRow;
        }

        FindPeak fp = new FindPeak();
        Integer answer = fp.findPeaks(areaNum, area);

        System.out.println(answer);
    }

    public Integer findPeaks(Integer areaNum, int[][] area) {

        Integer[] directionX = { -1, 0, 1, 0};
        Integer[] directionY = { 0, 1, 0, -1};
        Integer tempX = null;
        Integer tempY = null;
        Boolean flag  = null;
        Integer answer = 0;

        for(int x = 0; x < areaNum; x++){

            for(int y = 0; y < areaNum; y ++){

                flag = true;
                for( int a = 0 ; a < 4 ; a++ ){

                    tempX = x + directionX[a];
                    tempY = y + directionY[a];

                    if(

                        ( tempX >= 0 ) &&
                        ( tempX < areaNum ) &&
                        ( tempY >= 0 ) &&
                        ( tempY < areaNum ) &&
                        ( area[tempX][tempY] >= area[x][y] )

                    ){

                        flag = false;
                        break;

                    }

                }
                answer = flag == true ? answer + 1 : answer;

            }
        }
        return answer;
    }
}
