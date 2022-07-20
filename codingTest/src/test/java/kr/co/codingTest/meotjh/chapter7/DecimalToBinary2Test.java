package kr.co.codingTest.meotjh.chapter7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinary2Test {

    DecimalToBinary2 dtb = new DecimalToBinary2();

    @Test
    @DisplayName( "십진법이 이진법으로 바뀌는 알고리즘을 테스트한다.")
    void deToBeTest(){
        //given
        int demicalNum = 11;
        StringBuilder sb = new StringBuilder();


        //when
        String rslt = dtb.deToBi(demicalNum, sb);

        //then
        String answer = "1011";
        Assertions.assertThat(rslt).isEqualTo(answer);
    }

}