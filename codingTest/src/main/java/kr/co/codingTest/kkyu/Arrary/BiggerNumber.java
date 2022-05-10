package biggerNumber;

import java.util.ArrayList;
import java.util.Scanner;


class BiggerNumber {

	public ArrayList<Integer> solution(int n, int[] arr){ 
	ArrayList<Integer> answer = new ArrayList<>();
	// 0번은 무조건 출력
	answer.add(arr[0]);
	// 1번부터 추가할지 말지 앞의 숫자랑 비교
	for(int i=1; i<n; i++) {
		// 현재 i가 i-1보다 크면 i를 넣어준다
		if(arr[i]>arr[i-1]) answer.add(arr[i]);
	}
	
	return answer;	
}	

	public static void main(String[] args) {
		BiggerNumber T = new BiggerNumber();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		// n값을 동적 배열에 넣음
		int[] arr = new int[n];
		// for문을 통해 입력 받은 스캐너 값 들어감
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

}
