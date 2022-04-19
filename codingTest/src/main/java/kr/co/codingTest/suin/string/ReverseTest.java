package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class ReverseTest {
	static Scanner scanner = new Scanner(System.in);
	
	public static String[] reverse(int input) {
		String[] result = new String[input];
		StringBuilder output = new StringBuilder();
	    
		for(int i=0; i<input; i++) {
			result[i] = scanner.next();
			output.setLength(0);
			result[i] = output.append(result[i]).reverse().toString();
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws Exception {
		int input = scanner.nextInt();
		
		for(String temp : reverse(input)) {
			System.out.println(temp);
		}
	}
}
