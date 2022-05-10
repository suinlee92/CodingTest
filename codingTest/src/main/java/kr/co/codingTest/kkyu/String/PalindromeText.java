package kr.co.codingTest.kkyu;

import java.util.Scanner;

class PalindromeText {
	// i < ren/2
	// 길이를 2로 나눈 몫의 전까지만 for문을 돌면 된다
	// str이 회문인지 파악해야 한다
	public String solution(String str) {
		// String answer = "YES";
		String answer = "NO 다르단 말이야";
		// 대소문자 구분 없이 소문자로 다 변경
		//str=str.toLowerCase();
		//int len = str.length();
		//for(int i=0; i<len/2; i++) {
			//if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		//}
		
		// StringBuilder로 스트링 객체 만들고 reverse로 뒤집은 다음 toString으로 문자열 변환
		String tmp = new StringBuilder(str).reverse().toString();
		// str = 원래 입력 값 tmp 뒤집어진 값
		// equals를 통해 원래 문자열이랑 뒤집어진 값이랑 같니?
		// equals는 대소문자를 구분해서 equalsIgnoreCase로 활용
		// equalsIgnoreCase 대소문자 구분을 안함
		if(str.equalsIgnoreCase(tmp)) answer="YES 우린 다 같아";
		return answer;
	}
	
	
	
	
	
	public static void main(String[] args) {
		PalindromeText T = new PalindromeText();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));

	}

}
