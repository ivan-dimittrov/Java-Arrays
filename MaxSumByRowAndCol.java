import java.util.*;
public class MaxSumByRowAndCol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter one positive integer in the range 2-10 "
				+ "for the size of the matrix:");
		
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

		int matrix[][] = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("matrix[%d][%d] = ", i, j);
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int sumByRows = 0;
		int sumByCols = 0;
		int maxSumByRows = 0;
		int maxSumByCols = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sumByRows += matrix[i][j];
				sumByCols += matrix[j][i];
			}
			if (sumByRows > maxSumByRows) {
				maxSumByRows = sumByRows;
			}
			if (sumByCols > maxSumByCols) {
				maxSumByCols = sumByCols;
			}
			sumByCols = 0;
			sumByRows = 0;
		}
		System.out.println("The biggest sum by rows: " + maxSumByRows);
		System.out.println("The biggest sum by cols: " + maxSumByCols);
		
		if (maxSumByRows > maxSumByCols) {
			System.out.println("Maximum sum by rows is > than maximum sum by cols");
		}else if (maxSumByRows == maxSumByCols) {
			System.out.println("Maximum sum by rows is = to maximum sum by cols");
		} else {
			System.out.println("Maximum sum by rows is < to maximum sum by cols");
		}
		sc.close();
	}
}
