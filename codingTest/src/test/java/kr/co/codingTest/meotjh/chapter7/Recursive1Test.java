package kr.co.codingTest.meotjh.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recursive1Test {

    Recursive1 recursive;

    @BeforeEach
    void setup(){
        recursive = new Recursive1();
    }

    @Test
    @DisplayName( "재귀함수 메소드를 테스트한다.")
    void recursiveTest(){
        //given
        int length = 3;
        int number = 1;

        //when //then
        recursive.printRuc(length, number);

    }
    
}