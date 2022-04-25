package kr.co.codingTest.meotjh.chapter1;

import kr.co.codingTest.meotjh.chapter1.StringExtract19;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringExtract19Test {

    private StringExtract19 se;

    @BeforeEach
    void init(){
        se = new StringExtract19();
    }

    @Test
    @DisplayName("입력을 받으면 숫자만 출력")
    void getSolution(){

        //given //when
        Integer solution = se.getSolution("g0en2T0s8eSoft");

        //then
        assertThat(solution).isEqualTo(208);
    }

}