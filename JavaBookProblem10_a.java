import java.util.*;

public class JavaBookProblem10_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Please enter two positive integers in the range 2-10");
		do {
			try {
				System.out.println("Please enter number of rows:");
				n = sc.nextInt();
				System.out.println("Please enter number of cols:");
				m = sc.nextInt();
			} catch (InputMismatchException e) {
				n = 0;
				m = 0;
				sc.next();
			}
			if ((n <= 1 || n > 10) || ((m <= 1 || m > 10))) {
				System.out.println("------------------------------------");
				System.out.println("Wrong input!");
				System.out.println("You have to enter two positive integers in the range 2-10:");
			}

		} while ((n <= 1 || n > 10) || ((m <= 1 || m > 10)));

		int[][] matrix = new int[n][m];
		int counter = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = counter++;
			}
		}
		System.out.println();
		// printing the matrix
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
