package fibonacciNumbers;

import java.util.Scanner;

class FibonacciNumbers {
	// solution은 배열을 리턴한다
	//public int[] solution(int n) {
		//int[] answer = new int[n];
		//answer[0]=1;
		//answer[1]=1;
		//for(int i=2; i<n; i++) {
			//answer[i] = answer[i-2]+answer[i-1];
		//}
		//return answer;
	//}
	
	// 손코딩 버전
	public void solution(int n) {
		int a = 1,
			b = 1,
			c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	
	
	public static void main(String[] args) {
		FibonacciNumbers T = new FibonacciNumbers();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		// 배열을 for each로 구현
		// for(int x : T.solution(n)) System.out.print(x+" ");
		// 손코딩 버전
		T.solution(n);
	}

}
