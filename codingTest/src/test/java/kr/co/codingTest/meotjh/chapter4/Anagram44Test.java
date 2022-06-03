package kr.co.codingTest.meotjh.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Anagram44Test {

    Anagram44 anagram44;

    @BeforeEach
    void init(){
        anagram44 = new Anagram44();
    }

    @Test
    void getRslt() {
        //given
        String ObjectStr = "bacaAacba";
        String SubjectStr = "abc";

        //when
        int rslt = anagram44.getRslt(ObjectStr, SubjectStr);

        //then
        int answer = 3;
        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}