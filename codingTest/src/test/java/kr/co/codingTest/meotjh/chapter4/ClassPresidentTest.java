package kr.co.codingTest.meotjh.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassPresidentTest {

    ClassPresident classPresident;

    @BeforeEach
    void init(){
        classPresident = new ClassPresident();
    }

    @Test
    void getSolutionTest() {

        //given
        String voteString = "BACBACCACCBDEDE";

        //when
        Character rslt = classPresident.getSolution(voteString);

        //then
        Character answer = 'C';

        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}