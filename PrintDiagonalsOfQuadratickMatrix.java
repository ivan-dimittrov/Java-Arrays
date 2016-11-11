public class PrintDiagonalsOfQuadratickMatrix {

	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 4, 6, 3 }, 
				{ 5, 9, 7, 2 }, 
				{ 4, 8, 1, 9 },
				{ 2, 3, 4, 5 } };

		System.out.println("Diagonals: ");

		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}

		System.out.println();

		for (int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--) {
			System.out.print(matrix[i][j] + " ");
		}
	}
}
