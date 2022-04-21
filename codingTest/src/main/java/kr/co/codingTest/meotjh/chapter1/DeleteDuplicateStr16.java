package kr.co.codingTest.meotjh.chapter1;

import java.util.Scanner;
import java.util.stream.Stream;

public class DeleteDuplicateStr16 {

    public static void main(String[] args) {

        DeleteDuplicateStr16 dds = new DeleteDuplicateStr16();
        String target = new Scanner(System.in).next();
        dds.extracted(target).forEach(System.out::print);

    }

    public Stream<Character> extracted(String target) {
        return target.chars().distinct().mapToObj(c -> (char) c);
    }
}
