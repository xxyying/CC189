package com.xxyyCC189.algo.chapter1;

public class isPermToOther {
	public boolean isPerm(String str1, String str2) {
		// corner case
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int[] check = new int[128];
		for (int i = 0; i < str1.length(); i++) {
			check[str1.charAt(i)]++;
		}
		
		for (int j = 0; j < str2.length(); j++) {
			check[str2.charAt(j)]--;
			if (check[str2.charAt(j)] < 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		isPermToOther test = new isPermToOther();
		String str1 = "apple";
		String str2 = "leapp";
		System.out.println("Test Case 1: " + str1 + " vs " + str2 + " --> " + test.isPerm(str1, str2));
		
		String str3 = "bana";
		String str4 = "xy";
		System.out.println("Test Case 2: " + str3 + " vs " + str4 + " --> " + test.isPerm(str3, str4));

	}

}
