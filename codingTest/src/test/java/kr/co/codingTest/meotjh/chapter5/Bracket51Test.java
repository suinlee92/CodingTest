package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bracket51Test {

    Bracket51 bracket51;

    @BeforeEach
    void setUp() {
        bracket51 = new Bracket51();
    }

    @Test
    void getResultStack() {

        //given
        String brackets = "()(()";

        //when
        String rslt = bracket51.getResultStack(brackets);

        //then
        String answer = "NO";
        Assertions.assertThat(rslt).isEqualTo(answer);
    }
}