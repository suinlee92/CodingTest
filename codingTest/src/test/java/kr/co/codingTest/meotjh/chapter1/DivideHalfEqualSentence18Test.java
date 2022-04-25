package kr.co.codingTest.meotjh.chapter1;

import kr.co.codingTest.meotjh.chapter1.DivideHalfEqualSentence18;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DivideHalfEqualSentence18Test {

    DivideHalfEqualSentence18 dh;

    @BeforeEach
    void init(){
        dh = new DivideHalfEqualSentence18();
    }

    @Test
    @DisplayName("회문 문장이 되는지 확인해야 한다.")
    void solution(){
        //given //when
        String answer = dh.getFlag("found7, time: study; Yduts; emit, 7Dnuof");
        //then
        Assertions.assertThat(answer).isEqualTo("YES");
    }

    @Test
    @DisplayName("회문 문장이 되지 않는지 확인한다.")
    void solution2(){
        //given //when
        String answer = dh.getFlag("aasda ssss ddd ssf");
        //then
        Assertions.assertThat(answer).isEqualTo("NO");
    }

}