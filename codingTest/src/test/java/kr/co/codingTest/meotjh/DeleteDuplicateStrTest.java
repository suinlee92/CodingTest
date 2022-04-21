package kr.co.codingTest.meotjh;

import kr.co.codingTest.meotjh.chapter1.DeleteDuplicateStr16;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteDuplicateStrTest {

    private DeleteDuplicateStr16 dds = new DeleteDuplicateStr16();

    @Test
    @DisplayName("중복이_들어가면_없앤다")
    void extract(){
        //given
        StringBuilder sb = new StringBuilder();

        String[] targetArr = {
                "ksekkset"
                ,"kjkgjlskjekieogiwo"
                ,"kdkgksjgkjlsjgkjsljgkjaksjg"
                ,"eiotuoiwtitoiywiotieoiutoiwioweuotiuwoieut"
                ,"qiutoiwuotiqpituoiwuiotuowutowiutoityioqp"
        };

        String[] answer = {
                "kset"
                ,"kjglseiow"
                ,"kdgsjla"
                ,"eiotuwy"
                ,"qiutowpy"
        };

        List<Stream<Character>> beforeStringArr = new ArrayList<Stream<Character>>();
        for (String s : targetArr) {
            beforeStringArr.add(dds.extracted(s));
        }

        // when

        List<String> solutionArr = new ArrayList<String>();
        for (Stream<Character> characterStream : beforeStringArr) {
            solutionArr.add(
                    characterStream.map(Object::toString).collect(Collectors.joining())
            );
        }

        //then

        for( int i = 0 ; i <answer.length ; i++){
            assertThat(solutionArr.get(i)).isEqualTo(answer[i]);
        }

    }

}