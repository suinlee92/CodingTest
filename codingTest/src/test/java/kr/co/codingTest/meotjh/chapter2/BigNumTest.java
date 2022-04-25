package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BigNumTest {

    BigNum21 bigNum;

    @BeforeEach
    void init(){
        bigNum = new BigNum21();
    }

    @Test
    @DisplayName("자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.")
    void getSolutionTest(){

        //given
        Integer length = 6;
        String target = "7 3 9 5 6 12";

        //when
        List<Integer> solution1 = bigNum.getIntegers(length, target);

        List<Integer> answer = new ArrayList<>();
        answer.add(7);
        answer.add(9);
        answer.add(6);
        answer.add(12);

        //then
        Assertions.assertThat(solution1).isEqualTo(answer);
    }

}