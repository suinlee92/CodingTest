package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveEratosthenesTest {

    SieveEratosthenes se;

    @BeforeEach
    void init(){
        se = new SieveEratosthenes();
    }

    @Test
    @DisplayName("소수의 갯수를 알려줘야 한다.")
    void getDemicalTest(){

        //given
        Integer numRange = 100;

        //when
        Integer result = se.getDemical(numRange);

        //then
        Assertions.assertThat(result).isEqualTo(25);
    }

}