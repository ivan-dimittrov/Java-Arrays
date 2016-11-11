import java.util.*;

public class JavaBookProblem09 {

	// Example: { 2, 4, 5, 4, 3, 2, 4, 2, 5, 8 }
	// S = 11 -> [2, 4, 5],[3, 2, 4, 2],[4, 2, 5]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one positive integer: ");

		int s;
		do {
			try {
				s = sc.nextInt();
			} catch (InputMismatchException e) {
				s = 0;
				sc.next();
			}

			if (s <= 0) {
				System.out.println("The input must be a positive integer greater than 0:");
			}
		} while (s <= 0);

		int[] arr = new int[] { 11, 2, 4, 5, 4, 3, 2, 4, 2, 5, 8, 1};
		int currentSum = 0;
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < s) {
				currentSum = arr[i];
				result.add(arr[i]);

				for (int j = i + 1; j < arr.length; j++) {
					currentSum += arr[j];
					if (currentSum < s) {
						result.add(arr[j]);
					}
					if (currentSum > s) {
						break;
					}
					if (currentSum == s) {
						result.add(arr[j]);
						System.out.println(result);
						break;
					}
				}
				result.clear();
			}
		}
		sc.close();
	}
}
