package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostFix53Test {

    PostFix54 postFix53;

    @BeforeEach
    void init(){
        postFix53 = null;
        postFix53 = new PostFix54();
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