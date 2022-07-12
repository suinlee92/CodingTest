package kr.co.codingTest.meotjh.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoordinateSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0 ; i<length ; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr){
            System.out.println(o.x + " " + o.y);
        }
    }
}
class Point implements Comparable<Point>{
    public int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if( this.x == o.x){
            return this.y - o.y;
        }else{
            return this.x - o.x;
        }
    }
}
