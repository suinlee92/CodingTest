package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class LoopCheckTest {

	public static String loopCheck(String string) {
		
		char[] charArray = string.toCharArray();
		StringBuilder result = new StringBuilder();
		int count = 0, index = 0;
		
		for(int i=0; i<charArray.length; i++) {
			i = index;
			index = i + 1;
			count = 1;

			if(i < charArray.length - 1) {
				while(charArray[i] == charArray[index]) {
					index++;
					count++;
					if(index >= charArray.length) {
						break;
					}
				}
				
				result.append(charArray[i]);
				
				if(count > 1) {
					result.append(count);
				}
			}else if(index <= charArray.length){
				result.append(charArray[charArray.length - 1]);
			}
		}
		
		return result.toString();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		System.out.println("result : " + loopCheck(string));
	}

}
