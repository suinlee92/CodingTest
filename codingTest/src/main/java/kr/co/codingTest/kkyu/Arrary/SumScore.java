package sumScore;

import java.util.Scanner;


class SumScore {
	public int solution(int n, int[] arr) {
		// answer, cnt 0으로 초기화
		int answer = 0,
		cnt = 0;
		// for문이 실행되면서 입력된 점수 즉 i가 하나씩 검증
		for(int i=0; i<n; i++) {
		// i가 1이면 즉 정답이면 cnt(점수)를 증가시킨다
			if(arr[i]==1) {
				cnt++;
		// 그리고 answer에 cnt 대입		
				answer+=cnt;
			}
		// 그게 아니면 0으로 초기화	
			else cnt=0;
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		SumScore T = new SumScore();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		
			System.out.print(T.solution(n, arr));

	}

}
