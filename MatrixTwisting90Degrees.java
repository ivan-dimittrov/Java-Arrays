import java.util.*;
public class MatrixTwisting90Degrees {
//	1,2,3,4                      13,9,5,1
//	5,6,7,8                      14,10,6,2
//	9,10,11,12                   15,11,7,3
//	13,14,15,16   -->            16,12,8,4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one positive integer in the range 2-10 "
				+ "for the size of the matrix:");
		
		int n;
		do {
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				n = 1;
				sc.next();
			}

			if (n <= 1 || n >= 11) {
				System.out.println("The input must be a positive integer in the range 2-10:");
			}
		} while (n <= 1 || n >= 11);
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("matrix[%d,%d] = ",i,j);
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Òwisted 90 degrees matrix:");
		System.out.println();
		
		int row = n - 1, element = 0 ,printedRows = 0;
		while (true) {
			if (row < 0) {
				printedRows++;
				row = n - 1;
				element++;
				System.out.println();
				if (printedRows == n) {
					break;
				}
			}
			System.out.print(matrix[row][element] + " ");
			row--;
		}
		sc.close();
	}
}
