package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class NumberTest {

	public static int numberOutput(String string) {
		
		char[] charArray = string.toCharArray();
		StringBuilder resultString = new StringBuilder();
		
		for(char c : charArray) {
			if(Character.isDigit(c)) {
				resultString.append(c);
			}
		}
		
		//이거 안해줘도 됨 형변환 시에 자동으로 없애줌
		if(resultString.indexOf("0") == 0)	resultString.deleteCharAt(0);
		
		return Integer.parseInt(resultString.toString());
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		System.out.println("result : " + numberOutput(string));

	}

}
