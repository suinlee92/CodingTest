package kr.co.codingTest.kkyu;

import java.util.Scanner;

// ���� �� �ܾ� ã��
public class sentenceInWord {

	public String solution(String str) {
		String answer="";
		int m=Integer.MIN_VALUE,
		// split�� ���� for������ �ذ�
//		String[] s=str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m=len;
//				answer=x;
//			}
//		}
		// indexof, substring���� �ذ�
		pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m) {
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
}
	
	
	
	public static void main(String[] args) {
		sentenceInWord T = new sentenceInWord();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
