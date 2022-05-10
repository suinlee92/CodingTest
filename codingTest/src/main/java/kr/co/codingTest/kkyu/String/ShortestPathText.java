package shortestPathText;

import java.util.Scanner;

// teachermode e
// 문자열 s받고 문자 t받고
// 문자열 s의 길이만큼 동적으로 int 배열 할당
class ShortestPathText {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		// p값은 최대한 크게 선언
		int p = 1000;
		// s길이만큼 for문 실행
		// i가 t문자니 예시는 e
		// i가 t면 0으로 초기화 아니면 증감 ++
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
			p=0;
			answer[i] = p;
		}	
			else {	
				p++;
				answer[i] = p;
			}		
		}
		//--왼쪽에서 있는 e로부터 떨어져 있는 거리 구하는 for문
		
		//--오른쪽에서 있는 e로부터 떨어져 있는 거리 for문 시작
		p = 1000;
		// 배열 끝에서 부터 확인해야 해서 -1
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t)
				// 기존 값이 있기 때문에 i와 t가 같으면 0 초기화
				p=0;
				else {	
					p++;
					// 기존값 i와 새로운 p값 중에 작은 값으로 대입
					answer[i] = Math.min(answer[i], p);
				}		
			}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		ShortestPathText T = new ShortestPathText();
		Scanner kb = new Scanner(System.in);
		// 문자열 읽을때
		String str=kb.next();
		// 문자 한개를 읽을때
		char c=kb.next().charAt(0);
		for(int x : T.solution(str, c)){
			System.out.print(x+" ");
		}

	}

}
