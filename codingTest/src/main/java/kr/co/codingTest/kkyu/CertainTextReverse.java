package certainTextReverse;

import java.util.Scanner;

public class CertainTextReverse {

	// 큰 while문 안에 left 증가, right 감소로 
	// if, else if, else로 구현
	public String solution(String str) {
		String answer;
		// 스트링을 기반으로한 문자 배열 생성
		char[] s=str.toCharArray();
		// 0번 인덱스부터 넣으니까 왼쪽은1
		// 오른쪽은 길이에서 -1를 해서 맨끝 문자를 바라보도록
		int left = 0, right=str.length()-1;
		// 왼쪽이 오른쪽보다 작다 걍 외우라고 함
		while(left<right) {
			// 캐릭터 클래스 안에 isAlphabetic 함수 활용
			// left가 알파벳이면 참이다
			// 우리는 알파벳이 아닌걸 찾아야 하므로 부정 !을 건다
			if(!Character.isAlphabetic(s[left])) left++;
			// right도 알파벳이 아닌걸 찾아야 하므로 부정 !을 건다
			// 대신 서로 마주보며 줄어들어야 하기 때문에 right는 감소
			else if(!Character.isAlphabetic(s[right])) right--;
			else {
				// 손코딩 부분 
				// left와 right를 서로 바꾼다
				// s 문자 배열을 전환한거다
				char tmp = s[left];
				s[left]=s[right];
				s[right]=tmp;
				left++;
				right--;
			}	
		}
		// answer를 string 전환을 해준다
		answer = String.valueOf(s);
		return answer;	
	}
	
	
	
	public static void main(String[] args) {
		CertainTextReverse T = new CertainTextReverse();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));

	}

}
