package interviewPrepare;

public class Q2IsPalindrome {
	public boolean isPalindrome(String input) {
		if(input == null || input.length() <=1) {
			return true;
		}
		String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int start = 0;
		int end = s.length() - 1;
		while(start <= end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
