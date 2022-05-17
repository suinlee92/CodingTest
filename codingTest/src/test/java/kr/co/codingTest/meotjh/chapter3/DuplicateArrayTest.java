package kr.co.codingTest.meotjh.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateArrayTest {

    DuplicateArray duplicateArray;

    @BeforeEach
    void init(){
        duplicateArray = new DuplicateArray();
    }

    @Test
    void getDuplicateIdxList() {

        //given
        int[] firArr = {1, 3, 9, 5, 2};
        int[] secArr = {3, 2, 5, 7, 8};

        //when
        List<Integer> result = duplicateArray.getDuplicateIdxList(firArr,secArr);

        //then
        List<Integer> answer = new ArrayList<>(Arrays.asList(2, 3, 5));
        assertThat(result).isEqualTo(answer);

    }
}