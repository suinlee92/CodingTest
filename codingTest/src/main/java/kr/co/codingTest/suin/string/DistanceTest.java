package kr.co.codingTest.suin.string;

import java.util.Scanner;

public class DistanceTest {

	public static String distance(String string, char Char) {
		
		char[] charArray = string.toCharArray();
		int[] resultArray = new int[charArray.length];
		StringBuilder indexTotal = new StringBuilder();
		
		//입력받은 char의 모든 위치를 stringBuilder로 구분값(" ")을 주고 담기
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i] == Char) {
				indexTotal.append(i).append(" ");
			}
		}
		
		//입력받은 char의 위치는 array에 담기
		String[] stringArray = indexTotal.toString().split(" ");
		
		//입력받은 char의 array 횟수만큼 for문을 돌면서 가장 가까운 거리의 값 찾기
		for(int i=0; i<stringArray.length; i++) {
			for(int j=0; j<charArray.length; j++) {
				if(charArray[j] == Char) {
					resultArray[j] = 0;
				}else {
					if(resultArray[j] == 0) {
						resultArray[j] = Math.abs(j - Integer.parseInt(stringArray[i]));  
					}else if(resultArray[j] > Math.abs(j - Integer.parseInt(stringArray[i]))){
						resultArray[j] = Math.abs(j - Integer.parseInt(stringArray[i])); 
					}
				}
			}
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i : resultArray) {
			result.append(i).append(" ");
		}

		return result.toString();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char Char = scanner.next().charAt(0);
		
		System.out.println("result : " + distance(string, Char));

	}

}
