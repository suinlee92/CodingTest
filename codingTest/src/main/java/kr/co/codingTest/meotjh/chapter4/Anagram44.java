package kr.co.codingTest.meotjh.chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ObjectStr = sc.nextLine();
        String SubjectStr = sc.nextLine();

        Anagram44 anagram44 = new Anagram44();
        int rslt = anagram44.getRslt(ObjectStr, SubjectStr);

        System.out.println(rslt);
    }

    public int getRslt(String ObjectStr, String SubjectStr) {

        int lt = 0,rslt = 0;
        HashMap<Character, Integer> anagramCnt = new HashMap<>();
        HashMap<Character, Integer> subAnaCnt = new HashMap<>();

        char[] charsObj = ObjectStr.toCharArray();
        char[] charsSbj = SubjectStr.toCharArray();

        for(int i = 0; i < ( SubjectStr.length() ) ; i++ ){
            subAnaCnt.put( charsSbj[i] , subAnaCnt.getOrDefault( charsSbj[i], 0) +1 );

            if( i < SubjectStr.length()-1 ){
                anagramCnt.put( charsObj[i] , anagramCnt.getOrDefault( charsObj[i], 0) +1 );
            }
        }

        for(int rt = SubjectStr.length() -1; rt < ObjectStr.length() ; rt++ ){
            anagramCnt.put( charsObj[rt],  anagramCnt.getOrDefault( charsObj[rt], 0) +1 );

            if(anagramCnt.equals(subAnaCnt)) {
                rslt++;
            }

            anagramCnt.put( charsObj[lt], anagramCnt.get(charsObj[lt])-1 );
            if(anagramCnt.get( charsObj[lt])==0) anagramCnt.remove(charsObj[lt]);
            lt++;

        }
        return rslt;
    }
}
