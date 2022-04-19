package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class SameStringWithoutTest {
	
	public static String checkString(String string) {
		
		string = string.replaceAll("[^a-z]", "");
		String reverse = new StringBuffer(string).reverse().toString();
		
		if(!string.equals(reverse)) {
			return "NO";
		}
		
		return "YES";
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String string = scanner.nextLine().toLowerCase();
		 
		 System.out.println("result : " + checkString(string));
	}

}
