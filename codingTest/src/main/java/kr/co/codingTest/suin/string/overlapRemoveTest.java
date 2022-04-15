package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class overlapRemoveTest {

	public static String remove(String string) {
		
		char[] charArray = string.toCharArray();
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i <charArray.length; i++) {
			if(string.indexOf(charArray[i]) == i)
			result.append(charArray[i]);
		}
		
		return result.toString();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println("result : " + remove(string));
	}
	
}
