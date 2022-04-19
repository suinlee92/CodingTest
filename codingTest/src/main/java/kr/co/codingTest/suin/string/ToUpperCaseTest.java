package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class ToUpperCaseTest {
	
	public static String toChange(String string) throws Exception {
		
		StringBuffer s = new StringBuffer();
		
		for(char c : string.toCharArray()) {
			if(Character.isUpperCase(c)) {
				s.append(Character.toLowerCase(c));
			}else if(Character.isLowerCase(c)){
				s.append(Character.toUpperCase(c));
			}else {
				throw new Exception("영문만 입력하세요.");
			}
		}
		
		return s.toString();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
			
		System.out.println("result : " + toChange(string));
	}
	
}
