package kr.co.codingTest.meotjh.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCompression111Test {
    StringCompression111 sc;

    @BeforeEach
    void init(){
        sc = new StringCompression111();
    }

    @Test
    @DisplayName("문자가 지속되면 압축한다")
    void getSolutionTest(){

        //given //when
        String solution1 = sc.getSolution("KKHSSSSSSSE").toString();
        String solution2 = sc.getSolution("KSTTTSEEKFKKKDJJGG").toString();

        //then
        assertThat(solution1).isEqualTo("K2HS7E");
        assertThat(solution2).isEqualTo("KST3SE2KFK3DJ2G2");
    }

}