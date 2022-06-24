package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    @DisplayName("버블정렬이 되어 나와야 한다.")
    void sort() {
        //given
        int arrNums = 6;
        int[] sortedTarget = {13,5,11,7,23,15};

        //when
        String result = bubbleSort.sort(arrNums, sortedTarget);

        //then
        String answer = "[5, 7, 11, 13, 15, 23]";
        Assertions.assertThat(result).isEqualTo(answer);

    }
}