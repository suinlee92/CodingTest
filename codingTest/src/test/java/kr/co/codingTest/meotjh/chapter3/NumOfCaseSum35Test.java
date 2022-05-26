package kr.co.codingTest.meotjh.chapter3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfCaseSum35Test {

    NumOfCaseSum35 numOfCaseSum35;

    @BeforeEach
    void init(){
        numOfCaseSum35 = new NumOfCaseSum35();
    }

    @Test
    void getAnswer() {

        //given
        int num = 15;

        //when
        int rslt = numOfCaseSum35.getAnswer(num);

        //then
        int ansr = 3;
        Assertions.assertThat(rslt).isEqualTo(3);

    }
}