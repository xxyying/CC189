package com.xxyyCC189.algo.chapter1;

public class ZeroMatrix {
	public void zeroMatrix(int[][] matrix) {
		boolean[] rowZero = new boolean[matrix.length];
		boolean[] colZero = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rowZero[i] = true;
					colZero[j] = true;
				}
			}
		}
		
		for (int i = 0; i < rowZero.length; i++) {
			if (rowZero[i]) {
				changeZeroRow(matrix, i);
			}
		}
		
		for(int j = 0; j < colZero.length; j++) {
			if(colZero[j]) {
				changeZeroCol(matrix, j);
			}
		}
	}
	
	private void changeZeroRow(int[][] matrix, int row) {
		for(int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	private void changeZeroCol(int[][] matrix, int col) {
		for(int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroMatrix test = new ZeroMatrix();
		int[][] matrix = new int[][]{{1,0,1}, {0,1,1}, {1,1,1}};
		test.zeroMatrix(matrix);
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
