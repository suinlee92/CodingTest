package kr.co.codingTest.meotjh.chapter5;


import java.util.*;

public class SavePrincess56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int princeNum = scanner.nextInt();
        int nthNum = scanner.nextInt();

        SavePrincess56 savePrincess = new SavePrincess56();
        Integer result = savePrincess.solution(princeNum, nthNum);

        System.out.println(result);

    }

    public Integer mySolution(int princeNum, int nthNum) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < princeNum; i ++){
            arrayList.add(i+1);
        }

        int idx = arrayList.indexOf(nthNum);
        while( arrayList.size() != 1 ){

            arrayList.remove(idx);
            idx = idx+ ( nthNum -1 );

            if( idx >= arrayList.size() ){
                idx = idx % arrayList.size();
            }

        }
        return arrayList.get(0);
    }

    public Integer solution(int princeNum, int nthNum){

        Queue<Integer> queue = new LinkedList<>();

        int result = 0;

        for(int i=1; i<=princeNum; i++) {
            queue.offer(i);
        }

        while( queue.isEmpty() != true ){

            for( int i = 1 ; i < nthNum ; i ++){
                queue.offer( queue.poll() );
            }
            queue.poll();

            if(queue.size() == 1) result = queue.poll();
        }

        return result;
    }

}
