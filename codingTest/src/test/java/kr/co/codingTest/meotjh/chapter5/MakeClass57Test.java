package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeClass57Test {

    MakeClass57 makeClass;

    @BeforeEach
    void setUp() {
        makeClass = new MakeClass57();
    }

    @Test
    void mySolution() {

        //given
        String majorClass = "CBA";
        String listenClasses = "CBDAGE";

        //when
        String result = makeClass.mySolution(majorClass, listenClasses);

        //then
        String answer = "YES";
        Assertions.assertThat(result).isEqualTo(answer);

    }
}