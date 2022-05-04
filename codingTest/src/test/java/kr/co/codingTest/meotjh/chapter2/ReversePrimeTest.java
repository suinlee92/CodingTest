package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrimeTest {

    ReversePrime reversePrime;

    @BeforeEach
    void init(){
        reversePrime = new ReversePrime();
    }

    @Test
    @DisplayName("숫자의 열을 넣으면 거꾸로된 숫자가 소수면 리스트에 담에넣어야 한다.")
    void gerReversePrimeListTest(){

        //given
        Integer listIdxs = 9;
        String beforeReversePrime = "32 55 62 20 250 370 200 30 100";

        //when
        List<Integer> results = reversePrime.gerReversePrimeList(listIdxs, beforeReversePrime);
        List<Integer> answer = new ArrayList<>(Arrays.asList(23,2,73,2,3));

        //then
        Assertions.assertThat(results).isEqualTo(answer);
    }
}