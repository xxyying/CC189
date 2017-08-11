package interviewPrepare;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Write a program that takes an integer and prints out all ways 
 * to multiply smaller integers that equal the original number, 
 * without repeating sets of factors. In other words, 
 * if your output contains 4 * 3, you should not print out 3 * 4 again 
 * as that would be a repeating set. Note that this is not asking for prime 
 * factorization only. Also, you can assume 
 * that the input integers are reasonable in size; 
 * correctness is more important than efficiency.
 */


public class Q8Factors {
	public void printFactors(int n) {
		List<Integer> factors = new ArrayList<>();
		Set<String> outputs = new TreeSet<String>();
		divide(n, 2, factors, outputs);
		for(String s : outputs) {
			System.out.println(s);
		}
	}
	
	private void divide(int n, int preFactor, List<Integer> factors, Set<String> outputs) {
		if (n == 1) {
			String output = "";
			for(Integer f: factors) {
				output += " * " + f;
			}
			outputs.add(output.substring(3));
		} else {
			for(int i = preFactor; i <= n; i++) {
				if(n%i == 0) {
					factors.add(i);
					divide(n/i, i, factors, outputs);
					factors.remove(factors.size() - 1);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Q8Factors test = new Q8Factors();
		int n = 25;
		test.printFactors(n);
		
		n = 100;
		test.printFactors(n);
	}

}
