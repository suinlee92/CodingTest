package kr.co.codingTest.meotjh.chapter3;

import com.jayway.jsonpath.internal.function.numeric.Sum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumSequenceDayTest {

    SumSequenceDay sumSequenceDay;

    @BeforeEach
    void setUp() {
        sumSequenceDay = new SumSequenceDay();
    }

    @Test
    @DisplayName("연속된 값을 받아 가장 큰 값을 받아와야 한다.")
    void getRslt() {
        //given
        int nums = 10;
        int sequenceDays = 3;
        int[] numArr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        //when
        int rslt = sumSequenceDay.getRslt(nums, sequenceDays, numArr);

        //then
        int answer = 56;
        assertThat(rslt).isEqualTo(answer);

    }
}