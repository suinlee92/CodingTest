package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckedPatternMaxTest {

    CheckedPatternMax cpm;

    @BeforeEach
    void init(){
        cpm = new CheckedPatternMax();
    }

    @Test
    @DisplayName("입력을 받으면 열,행,대각선의 각 줄을 다 더한 모든 경우의수 중 최댓값을 도출해야 한다.")
    void makeMaxNum(){

        //given
        Integer nums = 5;
        int[] One   = {10, 13, 10, 12, 15};
        int[] Two   = {12, 39, 30, 23, 11};
        int[] Three = {11, 25, 50, 53, 15};
        int[] Four  = {19, 27, 29, 37, 27};
        int[] Five  = {19, 13, 30, 13, 19};
        int[][] allData  = { One, Two, Three, Four, Five};

        //when
        Integer result = cpm.makeMaxNum(nums,allData);

        //then
        Integer answer = 155;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}