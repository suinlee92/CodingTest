package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CraneGameTest {

    CraneGame craneGame;

    @BeforeEach
    void setUp() {
        craneGame = new CraneGame();
    }

    @Test
    void resultCraneGame() {

        //given
        int[][] craneItem = { {0,0,0,4,3}, {0,0,2,2,5}, {0,1,5,4,1}, {0,0,0,4,3}, {0,3,1,2,1} };
        int craneMovNum = 8;
        int[] craneMove = {1, 5, 3, 5, 1, 2, 1, 4};

        //when
        int result = craneGame.resultCraneGame(craneItem, craneMovNum, craneMove);

        //then
        int answer = 4;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}