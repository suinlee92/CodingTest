package seeStudent;

import java.util.Scanner;


class SeeStudent {
	public int solution(int n, int[] arr) {
		// 첫번째 사람은 무조건 보이니까 
		int answer = 1,
		// max값은 배열의 첫번째 사람		
			max=arr[0];
		// 입력 받은 배열을 인덱스 따라 for문 반복
		for(int i=1; i<n; i++) {
			// 들어오는 배열값이 max값 보다 크면
			// answer 값 +
			// 그리고 max값을 arr[i]값으로 대입
			if(arr[i]>max ) {
				answer++;
				max=arr[i];
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		SeeStudent T = new SeeStudent();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		// n값을 동적 배열에 넣음
		int[] arr = new int[n];
		// for문을 통해 입력 받은 스캐너 값 들어감
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
			System.out.print(T.solution(n, arr));
		
	}

}
