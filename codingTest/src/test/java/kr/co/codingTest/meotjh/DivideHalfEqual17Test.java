package kr.co.codingTest.meotjh;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DivideHalfEqual17Test {

    public DivideHalfEqual17 dh;

    @Test
    @DisplayName("거꾸로해도 같으면 참이다")
    void divideTest(){

        //given
        dh = new DivideHalfEqual17();
        String target = "gooG".toUpperCase();
        //when
        String solution1 = dh.getSolution(target);
        //then
        assertThat(solution1).isEqualTo("YES");
    }

}