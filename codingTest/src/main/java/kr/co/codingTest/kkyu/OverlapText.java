package overlapText;

import java.util.Scanner;

class OverlapText {
	public String solution(String str) {
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			// charAt String 타입으로 받은 문자열을
			// char 타입으로 한 글자만 받는 함수
			// indexof 처음으로 발견된 문자의 인덱스 번호를 리턴
			//k 00 자기위치 / 처음 등장하는 위치
			//s 11
			//e 22
			//k 30
			//k 40
			//s 51
			//e 62
			//t 77
			//System.out.println
			//(str.charAt(i) + " " + i + str.indexOf(str.charAt(i)));
			// str에서 indexof로 문자열을 하나씩 따서 불러오면서
			// 참일때 중복이 안된 것 거짓일때는 이미 중복문자임
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		}	

		return answer;
	}
	
	public static void main(String[] args) {
		OverlapText T = new OverlapText();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
