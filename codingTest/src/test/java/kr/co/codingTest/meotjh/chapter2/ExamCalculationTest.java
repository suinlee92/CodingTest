package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamCalculationTest {

    ExamCalculation ec;

    @BeforeEach
    void init(){
        ec = new ExamCalculation();
    }

    @Test
    @DisplayName("시험 결과를 받으면 그 결과를 계산해야 한다.")
    void calExamRsltTest(){

        //given

        Integer nums = 10;
        String[] examCorrects = { "1", "0", "1", "1", "1", "0", "0", "1", "1", "0" };

        //when

        Integer result = ec.calExamRslt(nums, examCorrects);
        Integer answer = 10;

        //then
        Assertions.assertThat(result).isEqualTo(answer);
    }

}