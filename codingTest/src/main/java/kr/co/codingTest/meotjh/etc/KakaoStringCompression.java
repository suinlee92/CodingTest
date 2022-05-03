package kr.co.codingTest.meotjh.etc;

public class KakaoStringCompression {

    public static void main(String[] args) {

        String target = "abcabcdede";

        String temp, compare;
        int answer = 0, cnt = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= target.length()/2 ; i ++ ){

            temp = target.substring( 0, i );
            sb.setLength(0);

            for( int j = i ; j < target.length() ; j = j + i ){

                compare = j+i > target.length() ? target.substring(j, target.length() ): target.substring(j,j+i)  ;

                if( temp.equals(compare) ){
                    cnt++;
                }else{

                    if(cnt> 1){
                        sb.append(cnt);
                    }
                    sb.append(temp);

                    cnt = 1;
                    temp = compare;
                }
            }

            if( cnt > 1 ){
                sb.append(cnt);
            }
            sb.append(temp);

            if( answer == 0 ||  sb.length() < answer ){
                answer = sb.length();
            }

        }

        System.out.println(answer);

    }
}
