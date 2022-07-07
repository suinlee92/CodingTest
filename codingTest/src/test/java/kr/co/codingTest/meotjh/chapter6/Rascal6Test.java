package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Rascal6Test {

    Rascal6 rascal;

    @BeforeEach
    void setUp() {
        rascal = new Rascal6();
    }

    @Test
    void findRascal() {
        //given
        int stuLength = 9;
        int[] stuArr = {120, 125, 152, 130, 135, 135, 143, 127, 160};

        //when
        List<Integer> rslt = rascal.findRascal(stuLength, stuArr);

        //then
        List<Integer> answer = new ArrayList<>( Arrays.asList(3,8) );
        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}