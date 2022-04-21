package kr.co.codingTest.meotjh.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortDistance110 {

    public static void main(String[] args) {
        ShortDistance110 sd = new ShortDistance110();
        Scanner sc = new Scanner(System.in);

        String passiveStr = sc.next();
        String activeStr = sc.next();

        List<Integer> result = sd.getSolution(passiveStr, activeStr);

        for (Integer integer : result) {
            System.out.print(integer+ " ");
        }

    }

    public List<Integer> getSolution(String passiveStr, String activeStr) {

        List<Integer> activeStrIdxList = getActiveStrIdxList(passiveStr, activeStr);
        Integer tempNum = 0;
        Integer tempNumSnd = 0;
        List<Integer> result = new ArrayList<Integer>();

        for(    int passiveStrIdx = 0 ;
                passiveStrIdx < passiveStr.length() ;
                passiveStrIdx++
        ){

            for (Integer activeStrIdx : activeStrIdxList) {

                tempNumSnd = Math.abs( activeStrIdx - passiveStrIdx );
                if( fistIdx(activeStrIdxList, activeStrIdx) ||  tempNumSnd < tempNum ){
                    tempNum = tempNumSnd;
                }

            }
            result.add(tempNum);
            tempNum = 0;
        }

        return result;
    }

    private List<Integer> getActiveStrIdxList(String passiveStr, String activeStr) {

        Integer cnt = 0, temp = 0;
        List<Integer> activeStrIdxList = new ArrayList<Integer>();

        while( passiveStr.indexOf(activeStr, cnt) != -1){

            temp = passiveStr.indexOf(activeStr, cnt);
            cnt = temp != 0 ? temp+1 : cnt +1;
            activeStrIdxList.add(temp);

        }
        return activeStrIdxList;
    }

    private static boolean fistIdx(List<Integer> activeStrIndex, Integer strIndex) {
        return activeStrIndex.get(0).equals(strIndex);
    }
}