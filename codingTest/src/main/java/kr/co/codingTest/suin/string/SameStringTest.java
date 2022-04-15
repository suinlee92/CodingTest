package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class SameStringTest {

	//내꺼
	public static String checkString(String string) {
		
		char[] charArray = string.toCharArray();
		int lt = 0, rt = charArray.length-1, flag = 0;
		
		while(lt < rt) {
			if(charArray[lt] == charArray[rt]) {
				flag++;
			}
			lt++;
			rt--;
		}
		
		String result = flag == (int) charArray.length/2 ? "YES":"NO";  
		
		return result;
	}
	
	//강사꺼
//	public static String checkString(String string) {
//		
//		String reverse = new StringBuffer(string).reverse().toString();
//		
//		if(string.equalsIgnoreCase(reverse)) return "NO";
//		
//		return "YES";
//	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String string = scanner.next().toUpperCase();
		 
		 System.out.println("result : " + checkString(string));
	}

}
