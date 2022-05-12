package kr.co.codingTest.meotjh.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakTest {

    FindPeak fp;

    @BeforeEach
    void init(){
        fp = new FindPeak();
    }

    @Test
    @DisplayName("상하좌우 자신보다 큰 값이 없으면 +1 한 결과값을 가져와야 한다.")
    void findPeaksTest(){

        //given

        Integer arrNums = 5;
        int[] One   = {5, 3, 7, 2, 3};
        int[] Two   = {3, 7, 1, 6, 1};
        int[] Three = {7, 2, 5, 3, 4};
        int[] Four  = {4, 3, 6, 4, 1};
        int[] Five  = {8, 7, 3, 5, 2};
        int[][] allData  = { One, Two, Three, Four, Five};

        //when

        Integer results = fp.findPeaks(arrNums, allData);

        //then

        Integer answer = 10;
        Assertions.assertThat(results).isEqualTo(answer);

    }

}