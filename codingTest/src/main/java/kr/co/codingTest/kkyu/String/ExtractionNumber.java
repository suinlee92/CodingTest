package extractionNumber;

import java.util.Scanner;

// g0en2T0s8eSoft
// s가 문자와 숫자가 섞여 있는 문자열
class ExtractionNumber {
	public int solution(String s) {
		// answer 0으로 초기화
		// int answer = 0;
		String answer = "";
		// 캐릭터 배열로 변환 후 for문 구동
		for(char x : s.toCharArray()) {
			// x의 아스키 넘버가 48에서 57까지일때
			// 저 사이에 있으면 알파벳임 
			// if(x>=48 && x<57)
			// x-48을 해야 실제 숫자가 됨	
			// answer = answer*10+(x-48);
			//----------------------------
			// 캐릭터 클래스에 isDigit
			// x가 Digit인지 구분할 수 있다(숫자냐)
			if(Character.isDigit(x)) 
				// 스트링에 더하기를 누적한다
				answer+=x;
		}
		
		
		return Integer.parseInt(answer);
	}
	
	
	
	
	public static void main(String[] args) {
		ExtractionNumber T = new ExtractionNumber();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));

	}

}
