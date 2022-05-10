package rps;

import java.util.Scanner;


class Rps {
	public String solution(int n, int[] a, int[] b) {
		String answer = "";
		for(int i=0; i<n; i++) {
			// 서로 비기면 (a와 b값이 같을때는 무승무 D)
			if(a[i]==b[i]) answer+="D";
			// A가 이기는 경우의 수 나열
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			// 그 외는 B가 이기는 것
			else answer+="B";
		}
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		Rps T = new Rps();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		// a값을 동적 a배열에 넣음
		int[] a = new int[n];
		// b값을 동적 b배열에 넣음
		int[] b = new int[n];
		// for문을 통해 입력 받은 스캐너 값 들어감
		for(int i=0; i<n; i++) {
		// a가 낸 가위,바위,보 정보
			a[i] = kb.nextInt();
		}
		for(int i=0; i<n; i++) {
		// b가 낸 가위,바위,보 정보	
			b[i] = kb.nextInt();
		}
		// String을 문자 배열로 변환
		for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
		
	}

}
