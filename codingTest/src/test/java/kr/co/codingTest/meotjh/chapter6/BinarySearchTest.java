package kr.co.codingTest.meotjh.chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch bs;
    @BeforeEach
    void setUp() {
        bs = new BinarySearch();
    }

    @Test
    void binarySearch() {
        //given
        int length = 8, target = 32;
        int[] arr = {23, 87, 65, 12, 57, 32, 99, 81};


        //when
        int result = bs.binarySearch(target, 0, length, arr)+1;

        //then
        int answer = 3;
        org.assertj.core.api.Assertions.assertThat(result).isEqualTo(answer);
    }
}