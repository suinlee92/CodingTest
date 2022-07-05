package kr.co.codingTest.meotjh.chapter6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeastRecentlyUsedTest {

    LeastRecentlyUsed lru;

    @BeforeEach
    void setUp() {
        lru = new LeastRecentlyUsed();
    }

    @Test
    void calculateLRU() {
        //given
        int cacheNums = 5, dataLength = 9;
        int[] dataArr = {1, 2, 3, 2, 6, 2, 3, 5, 7};

        //when
        int[] rslt = lru.calculateLRU(cacheNums, dataLength, dataArr);

        //then
        int[] asnwer = {7, 5, 3, 2, 6};
        Assertions.assertThat(rslt).isEqualTo(asnwer);
    }
}