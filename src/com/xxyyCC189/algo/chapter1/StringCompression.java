package com.xxyyCC189.algo.chapter1;

/*
 * e.g. input = "aabcccccaaa"
 * 		output = "a2b1c5a3"
 */

public class StringCompression {
	public String stringCompression(String input) {
		if (input == null || input.length() == 0) {
			return "";
		}
		
		StringBuilder result = new StringBuilder();
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			 cnt++;
			// check if append to stringbuilder
			if (i + 1 >= input.length() || (input.charAt(i + 1) != input.charAt(i))) {
				result.append(input.charAt(i));
				result.append(cnt);
				cnt = 0;
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		StringCompression test = new StringCompression();
		String input = "aabccccaaa";
		System.out.println(test.stringCompression(input));
	}

}
