package yourGrade;

import java.util.Scanner;

class YourGrade {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		// 이중 for문 실행
		// i의 등수를 구해야 한다 처음에는 무조건 1등
		for(int i=0; i<n; i++) {
			int cnt=1;
			// j가 돌면서(기존에 입력된 점수) 등수를 cnt로 누적한다
			for(int j=0; j<n; j++) {
				// j점수가 i보다 크면 등수를 증가시켜줘
				if(arr[j]>arr[i])
					cnt++;
			}
			answer[i]=cnt;
		}
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		YourGrade T = new YourGrade();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
			for(int x : T.solution(n, arr)) System.out.print(x+ " ");
	}

}
