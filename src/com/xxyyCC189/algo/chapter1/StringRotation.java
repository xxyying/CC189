package com.xxyyCC189.algo.chapter1;

public class StringRotation {
	public boolean stringRotation(String s1, String s2) {
		String sResult = s1 + s1;
		
		if (s1.length() == s2.length() && s1.length() != 0) {
			return isSubstring(sResult, s2);
		}
		return false;
	}
	
	private boolean isSubstring (String a, String b) {
		boolean findSubstring = false;
		for(int i = 0; i < a.length() - b.length() + 1; i++) {
			if (a.substring(i, i + b.length()).equals(b)) {
				findSubstring = true;
			}
		}
		return findSubstring;
	}
	
	public static void main(String[] args) {
		StringRotation test = new StringRotation();
		boolean result = test.stringRotation("waterbottle", "erbottlewat");
		System.out.println(result);
		
		result = test.stringRotation("waterbottle", "erbottle");
		System.out.println(result);
	}

}
