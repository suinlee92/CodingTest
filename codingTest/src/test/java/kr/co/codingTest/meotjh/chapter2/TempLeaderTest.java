package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempLeaderTest {

    TempLeader le;

    @BeforeEach
    void init(){
        le = new TempLeader();
    }

    @Test
    @DisplayName("N명의 학생의 반을 입력받아 가장 많이 중복된 학생을 반장으로 한다.")
    void calTempLeaderTest(){

        //given

        Integer stuNums = 5;
        int[] stuClsOne   = {9,8,7,6,5};
        int[] stuClsTwo   = {5,6,7,8,9};
        int[] stuClsThree = {1,2,3,7,8};
        int[] stuClsFour  = {4,5,3,4,2};
        int[] stuClsFive  = {6,2,8,4,2};
        int[][] allStuCls = { stuClsOne, stuClsTwo, stuClsThree, stuClsFour, stuClsFive};

        //when

        Integer rslt = le.calTempLeader(stuNums, allStuCls);
        Integer anws = 3;

        //then

        Assertions.assertThat(rslt).isEqualTo(anws);
    }

}