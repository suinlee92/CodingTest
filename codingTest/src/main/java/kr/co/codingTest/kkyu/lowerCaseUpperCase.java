package lowerCaseUpperCase;

import java.util.Scanner;

// 대소문자 바꾸기
// StuDY
public class lowerCaseUpperCase {

	public String solution(String str) {
		String answer= "";
		// 향상된 for문으로 실행 할때
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x))
				answer+=Character.toUpperCase(x);
			else answer+= Character.toLowerCase(x);
		}
		return answer;
}
	
	
	
	public static void main(String[] args) {
		lowerCaseUpperCase T = new lowerCaseUpperCase();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		
		System.out.print(T.solution(str));
	}
}
