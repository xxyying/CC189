package com.xxyyCC189.algo.chapter1;

public class RotateMatrix {
	public void rotateMatrix(int[][] matrix ) {
		int len = matrix.length;
		for(int i = 0;  i < len/2; i++) {
			for(int j = i; j < len-1-i; j++) {
				int tmp = matrix[i][j]; // top left
			
			// top left = bottom left
			matrix[i][j] = matrix[len-1-j][i];
			
			// bottom left = bottom right
			matrix[len-1-j][i] = matrix[len-1-i][len-1-j];
			
			// bottom right = top right
			matrix[len-1-i][len-1-j] = matrix[j][len-1-i];
			
			// top right = tmp, which is top left
			matrix[j][len-1-i] = tmp;
			}   
		}
	}
	
	public static void main(String[] args) {
		RotateMatrix test = new RotateMatrix();
		int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
		test.rotateMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
				if (j == matrix[0].length -1 ) {
					System.out.print("\n");
				}
			}
		}
	}
		
		

}
