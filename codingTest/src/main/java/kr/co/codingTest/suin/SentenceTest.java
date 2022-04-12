package kr.co.codingTest.suin;

import java.util.Scanner;

public class SentenceTest {
	
//	public static String findLongest(String[] words) {
//		Arrays.sort(words, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.length()-o1.length();
//			}
//		});
//		return words[0];
//	}
	
	public static String findLongest(String[] words) {
		int length = 0;
		String result = "";
		
		for(String word : words) {
			length = word.length();
			if(length < word.length()) {
				length = word.length();
				result = word;
			}
		}
		
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] words = sentence.split(" ");

		System.out.println("result : " + findLongest(words));
	}

}
