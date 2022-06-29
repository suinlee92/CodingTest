package kr.co.codingTest.meotjh.chapter5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EmergencyRoom58Test {

    EmergencyRoom58 em;

    @BeforeEach
    void setUp() {
        em = new EmergencyRoom58();
    }

    @Test
    void getEmergency() {
        //given
        int arrNum = 5;
        int target = 2;
        int[] arr = {60, 50, 70, 80, 90};

        HashMap<Integer, Integer> patient = new HashMap<>();
        for(int i = 0 ; i < arrNum ; i ++){
            patient.put(i,arr[i]);
        }

        //when
        int rslt = em.getEmergency(target, patient);

        //then
        int answer = 3;
        Assertions.assertThat(rslt).isEqualTo(answer);

    }
}