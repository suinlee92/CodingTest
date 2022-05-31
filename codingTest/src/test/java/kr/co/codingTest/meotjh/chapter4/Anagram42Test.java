package kr.co.codingTest.meotjh.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Anagram42Test {

    Anagram42 anagram42;

    @BeforeEach
    void init(){
        anagram42 = new Anagram42();
    }

    @Test
    void getSolution() {

        //given
        String firStr = "AbaAeCe";
        String secStr = "baeeACA";

        //when
        String rslt = anagram42.getSolution(firStr, secStr);

        //then
        String answer = "YES";
        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}