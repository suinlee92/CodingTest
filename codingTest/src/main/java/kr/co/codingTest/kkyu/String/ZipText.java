package zipText;

import java.util.Scanner;


class ZipText {
	public String solution(String s) {
		/*
		String answer = "";
		// 맨뒤에 빈 문자열 꼭 추가
		s = s+" ";
		// cnt는 1로 초기화
		int cnt = 1;
		// 0번부터 ""공백 전까지 가야해서 -1
		for(int i=0; i<s.length()-1; i++) {
			// i랑 i+1지점이 같으면 cnt를 1증가
			if(s.charAt(i)==s.charAt(i+1))
				cnt++;
			// 서로 다르면 answer i값 대입
			// i값에 cnt append
			// cnt가 1보다 크면 1로 초기화
			else {
				answer+=s.charAt(i);
				if(cnt>1) answer+=String.valueOf(cnt);
				cnt=1;
			}
		}
		
		return answer;
		*/
		s = s+" ";
		int cnt = 1;
		// 단어 하나씩 가져오기
		char ch = s.charAt(0);
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i<s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
		} else {
			// ch i값으로 바꾸고
			ch = s.charAt(i);
			// 버퍼에 ch 붙이고
			buffer.append(ch);
			// cnt가 1보다 크면 버퍼에 cnt 붙이고
			if(cnt>1)
				buffer.append(cnt);
			// cnt 1로 초기화
            cnt = 1;
		}
		
	}
		return buffer.toString();
}
	
	public static void main(String[] args) {
		ZipText T = new ZipText();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));

	}

}
