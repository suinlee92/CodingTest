package kr.co.codingTest.suin.hashMap;

import java.util.*;

public class CaptainVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        Character[] array = new Character[student];
        for (int i = 0; i < student; i++) {
            array[i] = scan.next().charAt(0);
        }
        System.out.println("result : " + checkVote(array, student));
    }

    private static Character checkVote(Character[] array, int student) {

        HashMap<Character, Integer> vote = new HashMap<>();
        vote.put('A', 0);
        vote.put('B', 0);
        vote.put('C', 0);
        vote.put('D', 0);
        vote.put('E', 0);

        Integer temp = 0;
        for (Character v : array) {
            temp = vote.get(v);
            vote.put(v, ++temp);
        }

        Integer max = Collections.max(vote.values());
        Character key = null;

        for (Map.Entry<Character, Integer> entry : vote.entrySet()) {
            if (entry.getValue() == max) {
                key = entry.getKey();
            }
        }

        return key;
    }
}
