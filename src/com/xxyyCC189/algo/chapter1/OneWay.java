package com.xxyyCC189.algo.chapter1;

/*
 * 1.5 One Way
 * e.g.
 * pale, ple --- true
 * pales, pale --- true
 * pale, bale --- true
 * pale, bake --- false
 * 
 */

public class OneWay {
	public boolean isOneWay(String str1, String str2) {
		if ((str1 == null && str2 == null) || (str1.length() == 0 && str2.length() == 0)) {
			 return true;
		}
		
		if(str1.length() == str2.length()) {
			return replaceCheck(str1, str2);
		} else if (str1.length() + 1 == str2.length()) {
			return insertCheck(str2, str1);
		} else if (str1.length() - 1 == str2.length()) {
			return insertCheck(str1, str2);
		}
		
		return false;	
			
	}
	// replace
	private boolean replaceCheck (String str1, String str2) {
		boolean findDiff = false;
		for(int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (findDiff) {
					return false;
				}
				findDiff = true;
			}
		}
		return true;
	} 
	
	// insert
	private boolean insertCheck(String longStr, String shortStr) {
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < longStr.length() && idx2 < shortStr.length()) {
			if(longStr.charAt(idx1) != shortStr.charAt(idx2)) {
				if (idx1 != idx2) {
					return false;
				}
				idx1++;
			} else {
				idx1++;
				idx2++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		OneWay test = new OneWay();
		
		String str1 = "pale";
		String str2 = "ple";
		System.out.println(test.isOneWay(str1, str2));
		//System.out.println(OneWay.isOneWay(str1, str2));
		
		str1 = "pale";
		str2 = "bake";
		System.out.println(test.isOneWay(str1, str2));
		
		str1 = "pale";
		str2 = "pee";
		System.out.println(test.isOneWay(str1, str2));
		
		
	}

}
