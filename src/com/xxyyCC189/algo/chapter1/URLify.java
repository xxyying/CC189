package com.xxyyCC189.algo.chapter1;

public class URLify {
	public String urlify(String str, int len) {
		
		String result = "";
		if (str == null || len < 1) {
			return result;
		}
		char[] strChar = str.toCharArray();
		replaceSpace(strChar, len);
		
		for (int i = 0; i < strChar.length; i++) {
			result = result + strChar[i];
		}
		return result;
	}
	
	public void replaceSpace(char[] str, int len) {
		int cntSpace = 0;
		int idx;
		int i = 0;
		
		for(i = 0; i< len; i++) {
			if(str[i] == ' ') {
				cntSpace++;
			}
		}
		
		idx = len + cntSpace * 2;
		if (len < str.length) {
			str[len] = '\0';
		}
		for(i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				// replace to %20
				str[idx - 1] = '0';
				str[idx - 2] = '2';
				str[idx - 3] = '%';
				idx = idx - 3;
			} else {
				str[idx - 1] = str[i];
				idx--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		URLify test = new URLify();
		String str = "Mr John Smith    ";
		int len = 13;
		System.out.println("Test Case 1: " + test.urlify(str, len));
		
		str = "Mr Smith    ";
		len = 8;
		System.out.println("Test Case 2: " + test.urlify(str, len));
		
	}

}
