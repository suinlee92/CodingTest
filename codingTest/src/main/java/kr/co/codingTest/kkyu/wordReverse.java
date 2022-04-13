package wordReverse;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Scanner;

// 문자 뒤집기
//3
//good
//Time
//Big
class wordReverse {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		// 단순히 문자열만 뒤집는 알고리즘
//		for(String x : str) {
//			String tmp= new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		// 특정 문자만 뒤집는 알고리즘
		// 이 알고리즘 중요함 내가 구현할 줄 알아야 함
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		wordReverse T = new wordReverse();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

}
