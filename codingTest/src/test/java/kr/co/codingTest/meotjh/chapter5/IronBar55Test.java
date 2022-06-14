package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronBar55Test {

    IronBar55 ironBar;

    @BeforeEach
    void setUp() {

        ironBar = new IronBar55();
    }

    @Test
    void mySolution() {
        //given
        String targets = "(((()(()()))(())()))(()())(((()(()()))(())()))(()())(((()())))";

        //when
        int result = ironBar.mySolution(targets);

        //then
        int answer = 57;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}