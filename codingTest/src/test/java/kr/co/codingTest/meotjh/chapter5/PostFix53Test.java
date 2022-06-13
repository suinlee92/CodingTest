package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFix53Test {

    PostFix53 postFix53;

    @BeforeEach
    void init(){
        postFix53 = null;
        postFix53 = new PostFix53();
    }

    @Test
    void getPostFixAnswer() {

        //given
        String target = "352+*9-";
        //when
        Integer postFixAnswer = postFix53.getPostFixAnswer(target);
        //then
        Integer answer = 12;
        Assertions.assertThat(postFixAnswer).isEqualTo(answer);

    }
}