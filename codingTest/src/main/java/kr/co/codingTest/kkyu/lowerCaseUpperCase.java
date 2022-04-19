package kr.co.codingTest.kkyu;

import java.util.Scanner;

// ��ҹ��� �ٲٱ�
// StuDY
public class lowerCaseUpperCase {

	public String solution(String str) {
		String answer= "";
		// ���� for������ ���� �Ҷ�
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
