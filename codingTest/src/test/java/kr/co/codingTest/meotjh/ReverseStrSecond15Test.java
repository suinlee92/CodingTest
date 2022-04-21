package kr.co.codingTest.meotjh;

import kr.co.codingTest.meotjh.chapter1.ReverseStrSecond15;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStrSecond15Test {

    ReverseStrSecond15 rss;
    @BeforeEach
    void init(){
        rss = new ReverseStrSecond15();
    }


    @Test
    @DisplayName("특수문자를 제외하고 String이 반전되어야 한다.")
    void reverseSolutionTest(){

        //given //when
        String solution1 = rss.solution("a#b!GE*T@S");
        String solution2 = rss.solution("kdj#@kdjg%$#kdjgk@kd$dk");
        String solution3 = rss.solution("kqQdj#@kd#g%$#kdj&&gk@kd$dQGk");
        String solution4 = rss.solution("kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk");
        String solution5 = rss.solution("kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#");

        //then
        assertThat(solution1).isEqualTo("S#T!EG*b@a");
        assertThat(solution2).isEqualTo("kdd#@kkgj%$#dkgjd@kj$dk");
        assertThat(solution3).isEqualTo("kGQdd#@kk#g%$#jdk&&gd@kj$dQqk");
        assertThat(solution4).isEqualTo("kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk");
        assertThat(solution5).isEqualTo("kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#");
    }

}