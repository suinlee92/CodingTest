package kr.co.codingTest.meotjh.chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciNumbersTest {

    FibonacciNumbers fibonacciNumbers;

    @BeforeEach
    void init(){
        fibonacciNumbers = new FibonacciNumbers();
    }

    @Test
    @DisplayName("피보나치 수열을 리스트에 담아야 한다.")
    void calFiboNumsTest(){

        //given
        Integer fiboNumberIdxs = 10;

        //when
        List<Integer> fiboNums = fibonacciNumbers.calFiboNums(fiboNumberIdxs);
        List<Integer> answer = new ArrayList<>(Arrays.asList(1,1,2,3,5,8,13,21,34,55));

        //then
        assertThat(fiboNums).isEqualTo(answer);

    }
}