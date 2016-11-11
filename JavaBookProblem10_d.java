import java.util.*;

public class JavaBookProblem10_d {

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

		int[][] matrix = new int[n][n];
		int row = 0;
		int col = 0;
		String direction = "down";
		
		for (int i = 1; i <= n * n; i++) {
			
			if (direction == "down" && (row > n - 1 || matrix[row][col] != 0)) {
				direction = "right";
				row--;
				col++;
			}
			if (direction == "right" && (col > n - 1 || matrix[row][col] != 0)) {
				direction = "up";
				col--;
				row--;
			}
			if (direction == "up" && (row < 0 || matrix[row][col] != 0)) {
				direction = "left";
				row++;
				col--;
			}
			if (direction == "left" && (col < 0 || matrix[row][col] != 0)) {
				direction = "down";
				col++;
				row++;
			}
			
			
			matrix[row][col] = i;
			
			switch (direction) {
			case "down":
				row++;
				break;
			case "right":
				col++;
				break;
			case "up":
				row--;
				break;
			case "left":
				col--;
				break;
			default:
				break;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
