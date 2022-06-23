package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectSortTest {

    SelectSort ss;

    @BeforeEach
    void setUp() {
        ss = new SelectSort();
    }

    @Test
    void selecSortV2() {
        //given
        int arrNums = 9;
        int[] sortedTarget = {3, 7, 1, 5, 4, 2, 9, 8, 6};

        //when
        String result = ss.selecSortV2(arrNums, sortedTarget);

        //then
        String answer = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        Assertions.assertThat(result).isEqualTo(answer);
    }
}