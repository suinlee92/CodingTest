package kr.co.codingTest.suin.string;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecificReverseTest {

	public static String reverse(char[] charArray) {
		ArrayList<Integer> intArray = new ArrayList<>();
		char[] resultArray = new char[charArray.length];
		
		//영어인 char만 인덱스번호 array에 담기
		for(int i=0; i<charArray.length; i++) {
			if(Character.isLetter(charArray[i])) {
				intArray.add(i);
			}else {
				resultArray[i] = charArray[i];
			}
		}

		//인덱스번호 어레이에서 뒤에서부터 가져오기
		int count = intArray.size()-1; 
		
		//담긴인덱스번호 뒤에서부터랑 담긴인덱스번호 앞에서부터랑 교환
		for(int i=0; i<intArray.size(); i++) {
			if(intArray.get(i) <= charArray.length/2) {
				resultArray[intArray.get(count)] = charArray[intArray.get(i)];
				resultArray[intArray.get(i)] = charArray[intArray.get(count)];
			}
			count--;
		}
		
		return String.valueOf(resultArray);
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println("result : " + reverse(string.toCharArray()));
	}

}
