package com.xxyyCC189.algo.chapter2;
import java.io.*;
import java.util.*;


public class InterViewGearLauch {


	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 
	 
	 **
	 * Implement a function findAllPalindromes(String input)
	 * that takes a string as the input and returns the set of all palindromes in the string.
	 findAllPalindromes("a") -> {"a"}
	e.g. findAllPalindromes("abba") -> {"a", "b", "bb", "abba"}

	"abba" -> "abba"
	"bcacb" -> "bcacb"
	Process:
	a -> "a" ---- {a}

	ffabbagh

	abcba
	abcba
	abba
	 */

	  
	  //Finding all the odd palindromes centered a single character
	  public Set<String> findAllPalindromesSolution(String input) {
	     Set<String> result = new HashSet<>();
	     for(int i = 0; i < input.length(); i++) {
	       int lower = i;
	       int upper = i;
	       while (lower > 0 && upper < input.length() && input.charAt(lower) == input.charAt(upper)) {
	         result.add(input.substring(lower, upper+1));
	         result.add(input.substring(lower - 1, upper+1));
	
	         lower--;
	         upper++;
	       }
	    }
	    return result;
	  }
	  
	  public Set<String> findAllPalindromesFaster(String input) {
	    Set<String> res = new HashSet<>();
	    int len = input.length();
	    int start = (len % 2 == 0) ? len / 2 + 1 : len / 2;
	    int i, j = 0;
	    if (start % 2 == 0) {
	      i = start - 1;
	      j = start;
	    } else {
	      i = start - 1;
	      j = start + 1;
	    }
	    
	    for (; i >= 0; i--) {
	      for (; j < len; j++) {
	        res.add(input.substring(start, start+1));
	        if (input.charAt(i) == input.charAt(j)) {
	          res.add(input.substring(i, j+1));
	          res.add(input.substring(i, i+1));
	        } else {
	          res.add(input.substring(i, i+1));
	          res.add(input.substring(j, j+1));
	        }
	      }
	    }
	    return res;
	  }
	  
	  public Set<String> findAllPalindromes(String input) {
	    // check the corner case
	    Set<String> result = new HashSet<>();
	    
	    if (input.length() < 2) {
	      result.add(input);
	      return result;
	    }
	    
	    for(int i = 0; i < input.length(); i++) {
	       for( int j = i; j < input.length(); j++) {
	          if (helper(input.substring(i, j+1))) {
	            result.add(input.substring(i, j + 1)); 
	          }
	       }
	    }
	    return result;
	  }
	  
	  private boolean helper(String str) {
	    for(int i = 0; i <= str.length()/2; i++) {
	      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
	        return false; 
	      }
	    }
	    return true;
	  }
	  
	  public static void main(String[] args) {
		  InterViewGearLauch test = new InterViewGearLauch();
	    // String input = "abba";
	String input = "abba";
	// String input = "fabcbabbab"; // len
	    Set<String> result = test.findAllPalindromesSolution(input);
	    System.out.println(result);
	  }


}
