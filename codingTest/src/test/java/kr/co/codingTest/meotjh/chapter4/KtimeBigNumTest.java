package kr.co.codingTest.meotjh.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class KtimeBigNumTest {

    KtimeBigNum ktimeBigNum;

    @BeforeEach
    void setUp() {
        ktimeBigNum = new KtimeBigNum();
    }

    @Test
    void getRslt() {

        //given
        int nums = 10;
        int targetK = 3;
        int[] numArr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        //when
        int rslt = ktimeBigNum.getRslt(nums, targetK, numArr);

        //then
        int answer = 143;
        assertThat(rslt).isEqualTo(answer);
    }
}