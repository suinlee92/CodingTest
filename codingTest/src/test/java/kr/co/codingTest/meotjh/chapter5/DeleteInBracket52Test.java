package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteInBracket52Test {

    DeleteInBracket52 deleteInBracket52;

    @BeforeEach
    void setUp() {
        deleteInBracket52 = new DeleteInBracket52();
    }

    @Test
    void getResultTest(){
        //given
        String target = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

        //when
        String result = deleteInBracket52.getResult(target);

        //then
        String answer = "EFLM";
        Assertions.assertThat(result).isEqualTo(answer);
    }
}