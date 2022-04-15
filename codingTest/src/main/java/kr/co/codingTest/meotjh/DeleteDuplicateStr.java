package kr.co.codingTest.meotjh;

import java.util.Scanner;
import java.util.stream.Stream;

public class DeleteDuplicateStr {

    public static void main(String[] args) {

        DeleteDuplicateStr dds = new DeleteDuplicateStr();
        String target = new Scanner(System.in).next();
        dds.extracted(target).forEach(System.out::print);

    }

    public Stream<Character> extracted(String target) {
        return target.chars().distinct().mapToObj(c -> (char) c);
    }
}
