package primeNumberReverse;

import java.util.ArrayList;
import java.util.Scanner;

class PrimeNumberReverse {
	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int tmp=arr[i];
			int res = 0;
			while(tmp>0) {
				int t = tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		PrimeNumberReverse T = new PrimeNumberReverse();
		Scanner kb = new Scanner(System.in);
		// 입력값 n을 받음
		int n=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}

	}

}
