package Arrays;

import java.util.Scanner;

public class Array2DExampl3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows want? ");
		int inputRow=sc.nextInt();
		System.out.println("How many cols want? ");
		int inputCol=sc.nextInt();
		
		int[][] matrix=new int[inputRow][inputCol];
		
		matrixData(sc,matrix,inputRow,inputCol);
		show2DArray(matrix,inputRow,inputCol);
	
	}

	private static void matrixData(Scanner sc, int[][] matrix, int inputRow, int inputCol) {
		
		System.out.println("Enter matrix data: ");
		
		for(int i=0;i<inputRow;i++) {
			for(int j=0;j<inputCol;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
	}
	

	private static void show2DArray(int[][] matrix1, int inputRow, int inputCol) {
		
		System.out.println("Your matrix is: ");
		for(int i=0;i<inputRow;i++) {
			for(int j=0;j<inputCol;j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
