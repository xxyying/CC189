package interviewPrepare;

import java.util.ArrayList;

public class Q1Prime {
	public ArrayList<Integer> findPrime(int n) {
		if(n == 0) {
			return new ArrayList<>();
		}
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 2; i < n; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				result.add(i);
			}
		}
		return result;
	}
	
	public ArrayList<Integer> findPrime2(int n) {
		if(n == 0) {
			return new ArrayList<>();
		}
		ArrayList<Integer> result = new ArrayList<>();
		boolean[] isPrime = new boolean[n];
		for(int i = 2; i < n; i++) {
			if(isPrime[i] = true) {
				result.add(i);
			}
			for(int j = 2; i*j < n; j++) {
				if(i*j < n) {
					isPrime[i*j] = false;
				}
			}
		}
		return result;
	}
	
public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i = 0; i < n; i++) {
        		isPrime[i] = true;
        }
        int cnt = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime[i] == true) {
                cnt++;
            }
            for(int j = 2; i*j<n; j++) {
                if(i*j < n) {
                    isPrime[i*j] = false;
                }    
            }
        }
        return cnt;
    }
	
	
	public static void main(String[] args) {
		Q1Prime test = new Q1Prime();
		int n = 100;
		System.out.println(test.findPrime(n));
		
		n = 3;
		System.out.println(test.findPrime2(n));
		
		n = 3;
		System.out.println(test.countPrimes(n));
	}

}
