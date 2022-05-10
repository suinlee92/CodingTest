package kr.co.codingTest.kkyu;

import java.util.Scanner;

// ���� ã��
//Computercooler
//c
public class textSerch {

	public int solution(String str, char t) {
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		// System.out.println(str+" "+t);
		
		// for������ �����Ҷ�
//		for(int i=0; i<str.length(); i++) { 
//			if(str.charAt(i)==t) answer++;
//		}
		// ���� for������ ���� �Ҷ�
		for(char x : str.toCharArray())
			if(x==t) answer++;
		return answer;
}
	
	
	
	public static void main(String[] args) {
		textSerch T = new textSerch();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		char c=kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}
}
