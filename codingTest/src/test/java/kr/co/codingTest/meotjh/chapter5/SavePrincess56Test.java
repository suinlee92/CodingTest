package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavePrincess56Test {

    SavePrincess56 savePrincess;

    @BeforeEach
    void setUp() {
        savePrincess = new SavePrincess56();
    }

    @Test
    void mySolution() {

        //given
        int princeNum = 8;
        int targetNum = 3;

        //when
        Integer mySolution = savePrincess.mySolution(princeNum, targetNum);

        //then
        Integer answer = 7;
        Assertions.assertThat(mySolution).isEqualTo(answer);
    }
}