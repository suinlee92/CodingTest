package kr.co.codingTest.meotjh.chapter7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Factorial3Test {


    @Test
    @DisplayName( "팩토리얼 재귀함수를 테스트한다.")
    void factorial(){
        //given
        int num = 5;

        //when
        Factorial3 f = new Factorial3();
        int result = f.factorial(num);

        //then
        int answer = 120;
        Assertions.assertThat(result).isEqualTo(answer);
    }


}