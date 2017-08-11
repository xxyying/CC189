package leetcode;

public class LC640 {
	public String solveEquation(String equation) {
        
        int left = 0;
        int right = 0;
        int sign = 1;
        String result = "";
        boolean metEqual = false;
        boolean isCoe = false;
        int curNum = 0;

        
        for(int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            
            if(c == '-' ) {
                sign = -1;
            } else if(c == '+') {
                sign = 1;
            }
            if (c == '=') {
                metEqual = true;
            }
            
            while(isDigit(c) && i<equation.length()) {
                curNum = c-'0';
	             if (i > 0 && isDigit(c) && curNum != 0 && isDigit(equation.charAt(i-1))) {
	                curNum = sign*(10 * curNum + c - '0');
	             }
	             i++;
            }
            
            if (i > 0 && c == 'x' && isDigit(equation.charAt(i-1))) {
                isCoe = true;
            } else if (i > 0 && c == 'x' && isDigit(equation.charAt(i-1))) {
                isCoe = true;
                curNum = 1;
            } else if (i == 0 && c == 'x') {
            		isCoe = true;
            		curNum = 1;
            }
            if(isCoe) {
                if (!metEqual) {
                    left += sign * curNum;
                } else {
                    left -= sign * curNum;
                }
            } else if (!isCoe && metEqual) {
                if (!metEqual) {
                    right -= sign * curNum;
                } else {
                    right += sign * curNum;
                }
            }
            
            if(left == 0 || left == right) {
                return "No solution";
            }
            
            curNum = 0;
            isCoe = false;
            
            
        }
        result = "x=" + right/left;
        return result;
    }
	
	private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
    
     
	public static void main(String[] args) {
		LC640 test = new LC640();
		String result = test.solveEquation("x+5-3+x=6+x-2");
		System.out.println("Expected result is \" " + "x=2\", actual result is : " + result);
		
		result = test.solveEquation("x=x");
		System.out.println("Expected result is \" " + "Infinite solutions\", actual result is : " + result);
		
		result = test.solveEquation("2x+3x-6x=x+2");
		System.out.println("Expected result is \" " + "x=-1\", actual result is : " + result);
		
		result = test.solveEquation("2x=x");
		System.out.println("Expected result is \" " + "x=0\", actual result is : " + result);
		
		result = test.solveEquation("x=x+2");
		System.out.println("Expected result is \" " + "No solution\", actual result is : " + result);
	}

}
