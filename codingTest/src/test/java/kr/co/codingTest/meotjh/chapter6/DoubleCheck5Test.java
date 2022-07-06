package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCheck5Test {

    DoubleCheck5 dc;

    @BeforeEach
    void setUp() {
        dc = new DoubleCheck5();
    }

    @Test
    void findDouble() {
        //given
        int length = 8;
        int[] arr = {20, 25, 52, 30, 39, 33, 43, 33};

        //when
        String result = dc.findDouble(length, arr);

        //then
        String answer = "D";
        Assertions.assertThat(result).isEqualTo(answer);
    }
}