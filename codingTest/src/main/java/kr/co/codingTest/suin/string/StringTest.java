package kr.co.codingTest.suin.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringTest {

	public static Integer findChar(String string, char Char) {
		return (int) string.chars().filter(find -> find == Char).count();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next().toUpperCase();
		String Char = scanner.next().toUpperCase();
		
		if(!Pattern.matches("^[a-zA-Z]*$", string) || !Pattern.matches("^[a-zA-Z]*$", Char)) {
			throw new Exception("영어만 입력해주세요.");
		}else if(string.length() > 100) {
			throw new Exception("100자 이하로 입력해주세요.");
		}
		
		System.out.println("result : " + findChar(string, Char.charAt(0)));
	}

}
