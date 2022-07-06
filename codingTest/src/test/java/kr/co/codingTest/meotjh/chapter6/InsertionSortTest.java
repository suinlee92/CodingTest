package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    InsertionSort3 is;

    @BeforeEach
    void setUp() {
        is = new InsertionSort3();
    }

    @Test
    void insertionSort() {
        //given
        int arrNum = 6;
        int[] targetArr = {11, 7, 5, 6, 10, 9};

        //when
        String rslt = is.insertionSort(arrNum, targetArr);

        //then
        String answer = "[5, 6, 7, 9, 10, 11]";
        Assertions.assertThat(rslt).isEqualTo(answer);
    }
}