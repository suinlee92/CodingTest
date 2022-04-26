package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentCntTest {

    StudentCnt studentCnt;

    @BeforeEach
    void init(){
        studentCnt = new StudentCnt();
    }

    @Test
    @DisplayName("선생님이 볼 수 있는 학생의 수를 구해야한다.")
    void getVisibleStuTest(){
        //given
        Integer students = 8;
        String studentHeits = "130 135 148 140 145 150 150 153";

        //when
        Integer answer = studentCnt.getVisibleStudent(students,studentHeits);

        //then
        assertThat(answer).isEqualTo(5);
    }

}