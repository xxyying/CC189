package com.xxyyCC189.algo.chapter1;

public class isPermToOther {
	public boolean isPerm(String str1, String str2) {
		
		// corner case
		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length()  < 1 || str2.length() < 1) {
			return false;
		}
		
		// check length & switch the name if str2.length() > str1.length()
		checkLength(str1, str2);
		
		
		
		
		
		
	}
	
	private void checkLength(String str1, String str2) {
		if (str1.length() < str2.length()) {
			String tmp = str1;
			str1 = str2;
			str2 = tmp;
		}
	}
	
	public static void main(String[] args) {
		isPermToOther test = new isPermToOther();
		String str1 = "xxxxapple";
		String str2 = "app";
		System.out.print("Test Case 1: " + str1 + " vs " + str2 + " " + test.isPerm(str1, str2));
		
		
		String str3 = "bana";
		String str4 = "xxxxxxxxy";
		System.out.print("Test Case 2: " + str3 + " vs " + str4 + " " + test.isPerm(str3, str4));

	}

}
