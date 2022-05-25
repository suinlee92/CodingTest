package kr.co.codingTest.meotjh.chapter3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PartSequenceSumTest {

    PartSequenceSum partSequenceSum;
    @BeforeEach
    void init(){
        partSequenceSum = new PartSequenceSum();
    }

    @Test
    @DisplayName("연속되어 합을 구하는 숫자를 찾아야 한다")
    void calSequenceNums() {
        //given
        int nums = 8;
        int sumNums = 6;
        int[] numArr = {1, 2, 1, 3, 1, 1, 1, 2};
        //when
        int rslt = partSequenceSum.calSequenceNums(nums, sumNums, numArr);
        //then
        int answer = 3;
        Assertions.assertThat(rslt).isEqualTo(answer);
    }
}