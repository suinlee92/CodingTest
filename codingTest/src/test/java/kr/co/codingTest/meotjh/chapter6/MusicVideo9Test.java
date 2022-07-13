package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicVideo9Test {

    MusicVideo9 mv;

    @BeforeEach
    void setUp() {
        mv = new MusicVideo9();
    }

    @Test
    void solution() {
        //given
        int length = 9, target = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        //when
        int result = mv.solution(length, target, arr);

        //then
        int answer= 17;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}