package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissors23Test {

    RockPaperScissors23 rps;

    @BeforeEach
    void init(){
        rps = new RockPaperScissors23();
    }

    @Test
    @DisplayName("가위바위보 승자를 나타내야 한다.")
    void getGameRsltTest(){
        //given
        int gameTimes = 10;
        Object[] playerA = {1, 2, 1, 2, 1, 3, 3, 2, 3, 1};
        Object[] playerB = {3, 3, 3, 2, 3, 3, 2, 3, 2, 3};

        //when
        List<String> gameRslt = rps.getGameRslt(gameTimes, playerA, playerB);

        List<String> answer = new ArrayList<>();
        answer.add("A");
        answer.add("B");
        answer.add("A");
        answer.add("D");
        answer.add("A");
        answer.add("D");
        answer.add("A");
        answer.add("B");
        answer.add("A");
        answer.add("A");

        //then
        Assertions.assertThat(gameRslt).isEqualTo(answer);
    }

}