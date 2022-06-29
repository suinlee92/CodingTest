package kr.co.codingTest.meotjh.chapter5;

import java.util.*;

public class EmergencyRoom58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();
        int target = sc.nextInt();

        HashMap<Integer, Integer> patient = new HashMap<>();
        for(int i = 0 ; i < arrNum ; i ++){
            patient.put(i, sc.nextInt());
        }

        EmergencyRoom58 em = new EmergencyRoom58();
        int rslt = em.getEmergency(target, patient);

        System.out.println(rslt);

    }

    public int getEmergency(int target, HashMap<Integer, Integer> patient) {

        Queue<Integer> patientLoop = new LinkedList<>();
        patient.forEach((key, value) -> {
            patientLoop.offer(key);
        });

        int rslt = 0;
        while( patientLoop.contains(target) ){
            Integer poll = patientLoop.poll();
            Integer emergencyValue = patient.get(poll);

            for (Integer key : patient.keySet()) {

                Integer value = patient.get(key);
                if( value > emergencyValue && ( poll != key ) ){
                    patientLoop.offer(poll);
                    break;
                }
            }

            if( patient.size() != patientLoop.size() ){
                patient.remove(poll);
                rslt++;
            }

        }
        return rslt;
    }
}
