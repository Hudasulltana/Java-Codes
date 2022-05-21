package com.daily_work.in;
import java.util.Scanner;

public class flood_fill {
	
	public static void solvePath(int[][] matrix, int row, int col, boolean[][] visited, String path ) {
		
		if(row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[0].length - 1 || matrix[row][col] == 1 || visited[row][col] == true) {
			return;
		}
		
		if(row == matrix.length - 1 && col == matrix[0].length - 1 ) {
			System.out.println(path);
			return;
		}
		
		visited[row][col] = true;
		solvePath(matrix, row - 1, col, visited, path+"t");
		solvePath(matrix, row, col - 1, visited, path+"l");
		solvePath(matrix, row + 1, col, visited, path+"d");
		solvePath(matrix, row, col + 1, visited, path+"r");
		visited[row][col] = false;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int matrix[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		boolean [][]visited = new boolean[row][col];
		solvePath(matrix, 0, 0, visited, "");
		
	}

}
