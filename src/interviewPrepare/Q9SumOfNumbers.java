package interviewPrepare;

/*
 * Sum of numbers in a random string
 */

public class Q9SumOfNumbers {
	public long sumofNums(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		
		int sum = 0;
		int curNum = 0;
		int sign = 1;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '-') {
				sign = -1;
			}
			
			if (isDigit(c) && curNum == 0) {
				curNum += c - '0';
			} else if (isDigit(c) && curNum != 0) {
				curNum = curNum*10 + c-'0';
			} else if(!isDigit(c) && curNum != 0) {
				sum += curNum*sign;
				curNum = 0;
				sign = 1;
			}
		}
		if(curNum != 0) {
			sum += curNum*sign;
		}
		return sum;
	}
	
	private boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}
	public static void main(String[] args) {
		Q9SumOfNumbers test = new Q9SumOfNumbers();
		String str = "-1abc10degsd2";
		System.out.println(test.sumofNums(str));
	
		str = "-1abc10degsd-2";
		System.out.println(test.sumofNums(str));
	}
	

}
