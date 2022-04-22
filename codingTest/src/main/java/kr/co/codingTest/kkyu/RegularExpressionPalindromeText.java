package kr.co.codingTest.kkyu;

import java.util.Scanner;

class RegularExpressionPalindromeText {
	public String solution(String s) {
		String answer = "NO 우린 같지 않아";
		// s는 알파벳만 있게
		// [^A-Z] A~Z가 아닌 것들
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		System.out.println(s);
		// tmp도 생성자 호출해서 객체 만들기
		// 원래 문자 s 뒤집어진 문자 tmp를 정규식으로 특수문자 지우고
		// 서로 순서가 같은 문자인지 비교
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES 맞아 우린 같아";
		return answer;
	}
	
	
	public static void main(String[] args) {
		RegularExpressionPalindromeText T = new RegularExpressionPalindromeText();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));

	}

}
