package kr.co.codingTest.meotjh.chapter3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    ArraySum arraySum;

    @AfterEach
    void after(){
        arraySum = null;
    }

    @Test
    @DisplayName("배열을 입력 받으면 합쳐서 정렬해서 보여주어야 한다.")
    void sumArrays() {

        //given
        arraySum = new ArraySum();

        Integer firArrayNums = 3;
        Integer secArrayNums = 5;

        Integer[] firArray = {1,3,5};
        Integer[] secArray = {2,3,6,7,9};

        //when

        Integer[] result = arraySum.sumArrays(firArrayNums,firArray,secArrayNums,secArray);

        //then

        Integer[] answer = {1,2,3,3,5,6,7,9};

        Assertions.assertThat(result).isEqualTo(answer);
    }
}