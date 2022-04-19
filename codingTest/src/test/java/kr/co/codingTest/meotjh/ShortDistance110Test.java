package kr.co.codingTest.meotjh;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShortDistance110Test {

    private ShortDistance110 sd;

    @BeforeEach
    void init(){
        sd = new ShortDistance110();
    }

    @Test
    @DisplayName("가장 짧은 문자거리")
    void solution(){
        //given
        String passiveStr = "fkdgkjdflkgjljslgjkfldjlkfdg";
        String activeStr  = "f";
        //when
        List<Integer> solution = sd.getSolution(passiveStr, activeStr);
        Object[] answerArr = solution.toArray();
        //then
        Object[] result = {0 ,1, 2, 3, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 2, 1, 0, 1, 2};
        assertThat(answerArr).isEqualTo(result);

    }

}