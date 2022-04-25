package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class DecoderTest {

	public static String decoder(int count, String string) {
		String[] stringArray = new String[count];
		char[] charArray = new char[7];
		StringBuilder resultString = new StringBuilder();
		string = string.replace("#", "1").replace("*", "0");
		int start = 0;
		int end = 7;
		int base = 1;
		int result = 0;
		
		for(int i=0; i<count; i++) {
			//7개씩 문자 짤라서 string 배열에 담기
			stringArray[i] = string.substring(start, end);
			start += 7;
			end += 7;
			
			//짤린 문자열을 char 배열에 담기
			charArray = stringArray[i].toCharArray();

			//char 배열만큼 도는데 last index에서부터 앞으로 당겨오기
			for(int j=charArray.length-1; j >= 0; j--) {
				//2^0 은 1이므로 for문 돌지않기
				if(j < charArray.length-1) {
					//j 로 for문 돌면서 2^j 해주기
					for(int k=1; k<=Math.abs(j-6); k++) {
						base*=2;
					}
				}
				//2^j 결과에 char 배열에 담긴(1 or 0) int로 변환해서 곱하기(char int로 바꾸면 아스키코드 나오므로 48(숫자 0의 아스키코드) 빼주기
				base *= Integer.valueOf(charArray[j]) - 48;
				result += base;
				base = 1;
			}
			resultString.append((char) result);
			result = 0;
		}
		
		return resultString.toString();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String string = scanner.next();
		
		System.out.println("result : " + decoder(count, string));
	}

}
