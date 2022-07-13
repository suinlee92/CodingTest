package kr.co.codingTest.suin.sortingNSearching;

import java.awt.*;
import java.util.*;

class Cd implements Comparable<Cd> {
    public int x, y;

    public Cd(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Cd o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Coordinate{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Cd> array = new ArrayList<>();
        int x, y;

        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            array.add(new Cd(x, y));
        }

        Collections.sort(array);

        for (Cd c: array) {
            System.out.println(c.x + ", " + c.y);
        }


    }
}
