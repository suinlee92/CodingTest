package kr.co.codingTest.meotjh.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Cipher112Test {

    Cipher112 cipher;
    @BeforeEach
    void init(){
        cipher = new Cipher112();
    }

    @Test
    @DisplayName("암호를 풀어서 문자로 바꾸어야한다.")
    void getSolutionTest(){

        //given
        Integer targetLength = 4;
        String target = "#****###**#####**#####**##**";

        //when
        String solution = cipher.getSolution(targetLength,target);

        //then
        assertThat(solution).isEqualTo("COOL");
    }
}