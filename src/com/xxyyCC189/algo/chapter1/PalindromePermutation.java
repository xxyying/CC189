package com.xxyyCC189.algo.chapter1;

/*
 * 1.4 Input: Tact Coa
 * 	   Output: True (taco cat, atco cta, etc...)
 */

public class PalindromePermutation {
	
	public boolean isPalindromePermutation(String input) {
		if (input == null || input.length() <= 0) {
			return true;
		}
		int oddCnt = 0;
		int[] alph = new int[26];
		for(char c : input.toCharArray()) {
			int value = getCharValue(c);
			if (value != -1) {
				alph[value]++;
				if (alph[value] % 2 == 1) {
					oddCnt++;
				} else {
					oddCnt--;
				}
			}
		}
		return oddCnt <= 1;
	}
	
	private int getCharValue(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (val >= a && val <= z) {
			return val - a;
		} else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		PalindromePermutation test = new PalindromePermutation();
		String input = "Tact Coa";
		boolean result = test.isPalindromePermutation(input);
		System.out.println(result);
		
		input = "Tact Co";
		result = test.isPalindromePermutation(input);
		System.out.println(result);
		
		input = "apple Apple";
		result = test.isPalindromePermutation(input);
		System.out.println(result);
		
		input = "apple";
		result = test.isPalindromePermutation(input);
		System.out.println(result);
		
	}

}
