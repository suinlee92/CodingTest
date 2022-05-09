package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankCalculationTest {

    RankCalculation rc;

    @BeforeEach
    void init(){
        rc = new RankCalculation();
    }

    @Test
    @DisplayName("입력을 받으면 순위를 나타낸다")
    void calRankTest(){

        //given
        Integer nums = 5;
        String[] ranks = { "87", "89", "92", "100", "76"};

        //when
        Integer[] result = rc.calRank(nums, ranks);

        //then
        Integer[] answer = { 4, 3, 2, 1, 5 };
        Assertions.assertThat(result).isEqualTo(answer);


    }

}