import java.util.*;
public class JavaBookProblem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;

		System.out.println("Please enter two positive integers in the range 4-10");
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
			if ((n <= 3 || n > 10) || ((m <= 3 || m > 10))) {
				System.out.println("------------------------------------");
				System.out.println("Wrong input!");
				System.out.println("You have to enter two positive integers in the range 4-10:");
			}

		} while ((n <= 3 || n > 10) || ((m <= 3 || m > 10)));

		int[][] matrix = new int[n][m];
		int sum = 0;
		int bestSum = 0;
		int bestRow = 0;
		int bestCol = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("matrix[%d,%d] = ",i,j);
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length - 2; i++) {
			for (int j = 0; j < matrix[0].length - 2; j++) {
				sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] + 
						matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]+
						matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = i;
					bestCol = j;
				}
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		System.out.println("The maximal sum is : " + bestSum);
		System.out.println("The best platform is:");
		  System.out.printf("  %d %d %d%n", matrix[bestRow][bestCol],
                  matrix[bestRow][bestCol + 1],matrix[bestRow][bestCol + 2]);
            System.out.printf("  %d %d %d%n",matrix[bestRow + 1][bestCol],
                  matrix[bestRow + 1][bestCol + 1],matrix[bestRow + 1][bestCol + 2]);
            System.out.printf("  %d %d %d%n",matrix[bestRow + 2][bestCol],
                    matrix[bestRow + 2][bestCol + 1],matrix[bestRow + 2][bestCol + 2]);
            
            sc.close();
	}

}
