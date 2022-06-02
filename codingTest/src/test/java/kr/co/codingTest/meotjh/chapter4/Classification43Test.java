package kr.co.codingTest.meotjh.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Classification43Test {

    Classification43 classification43;
    @BeforeEach
    void setUp() {
        classification43 = new Classification43();
    }

    @Test
    void classifyNums() {

        //given
        int nums = 7, boundary = 4;
        int[] numArr = {20, 12, 20, 10, 23, 17, 10};
        //when
        ArrayList<Integer> rslt = classification43.classifyNums(nums, boundary, numArr);
        //then
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(3, 4, 4, 3));
        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}