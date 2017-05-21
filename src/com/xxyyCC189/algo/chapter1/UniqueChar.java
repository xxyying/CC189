package com.xxyyCC189.algo.chapter1;

/*
 * 1.1 isUniqueChar 
 */

public class UniqueChar {
	public boolean isUniqueChar(String str) {
		if (str == null || str.length() < 1) {
			return true;
		}
		if (str.length() > 128) {
			return false;
		}
		
		boolean[] check = new boolean[128]; // why the size is 128 ???
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (check[val]) {
				return false;
			}
			check[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		UniqueChar test = new UniqueChar();
		
		String str1 = "apple";
		System.out.println("Test Case 1: " + str1 + " --> " + test.isUniqueChar(str1));
		
		String str2 = "abc";
		System.out.println("Test Case 2: " + str2 + " --> " + test.isUniqueChar(str2));

		String str3 = "coding";
		System.out.println("Test Case 3: " + str3 + " --> " + test.isUniqueChar(str3));
	
	}

}
