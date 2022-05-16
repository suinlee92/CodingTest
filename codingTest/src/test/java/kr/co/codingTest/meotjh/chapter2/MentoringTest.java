package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MentoringTest {

    Mentoring m;

    @BeforeEach
    void init(){
        m = new Mentoring();
    }

    @Test
    @DisplayName("학생 수, 시험횟수, 그에따른 순위를 받으면 멘토링 경우의수를 계산해야 한다.")
    void findMentorNumberOfCaseTest(){
        //given

        /*
        20 2
        19 15 4 17 12 18 6 3 11 14 1 8 13 9 2 20 5 16 10 7
        5 20 18 17 14 11 19 3 10 16 6 8 13 9 2 12 4 7 1 15
        */

        int stuNums = 20;
        int examNums = 2;

        Integer[] One   = {19, 15, 4, 17, 12, 18, 6, 3, 11, 14, 1, 8, 13, 9, 2, 20, 5, 16, 10, 7};
        Integer[] Two   = {5, 20, 18, 17, 14, 11, 19, 3, 10, 16, 6, 8, 13, 9, 2, 12, 4, 7, 1, 15};
        Integer[][] allData  = { One, Two};

        //when

        int mentorNumberOfCase = m.findMentorNumberOfCase(stuNums, examNums, allData);

        //then

        int answer = 90;
        Assertions.assertThat( mentorNumberOfCase ).isEqualTo(answer);
    }

}