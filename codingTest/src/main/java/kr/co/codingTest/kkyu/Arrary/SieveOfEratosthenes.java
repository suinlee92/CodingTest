package sieveOfEratosthenes;

import java.util.Scanner;


class SieveOfEratosthenes {
	public int solution(int n) {
		// answer로 카운팅한다
		//int answer = 0;
		// 체크 배열 하나 만든다
		// 인덱스 번호를 n번 인덱스 까지 하려면 +1
		//int[] ch = new int[n+1];
		// 0,1은 필요 없으니까 2번부터
		// n의 배수와 약수를 구해야 하므로 n까지 즉 <=
		//for(int i=2; i<=n; i++) {
		// ch의 i가 0이면 소수다
			//if(ch[i]==0) {
		// 카운팅 1 증가		
				//answer++;
		// i배수들 for문 돌려서 체크
		// j는 i부터 j도 n까지
		// j가 i의 배수만큼 돌아야 하기 때문에 i씩 증가해야 함		
				//for(int j=i; j<=n; j=j+i) ch[j]=1; 
			//}
		//}
		
		// answer 초기화
		int answer = 0;
		// 1번부터 접근한다
		int[] numbers = new int[n+1];
		// for문은 2번 인덱스 부터 0,1 소수 아님
		for(int i=2; i<numbers.length; i++) {
			// 0이면 소수 만나는 거임
			if(numbers[i] == 0) {
				// 소수 카운팅 1 증가
				answer++;
				// 새로만난 소수 1카운팅 증가 후
				// 그 소수의 배수 모두 찾아라
				// 2의 배수가 돌기 때문에 거의 1로 바뀜
				// 자기자신과 1말고도 2로 나누어 지면 소수 아님
				for(int j=i; j<numbers.length; j+=i) {
					if(numbers[j] != 1) {
						numbers[j] = 1;
					}
				}
			}
		}
		
		return answer;	
	}
	

	public static void main(String[] args) {
		SieveOfEratosthenes T = new SieveOfEratosthenes();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		System.out.println(T.solution(n));

	}

}
