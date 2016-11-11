import java.util.*;

public class JavaBookProblem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength;
		int[] arr;
		boolean error = true;

		System.out.print("Enter the length of the array:");
		do {
			try {
				arrLength = sc.nextInt();
			} catch (InputMismatchException e) {
				arrLength = 0;
				sc.next();
			}
			if (arrLength <= 0) {
				System.out.println("The input must be a positive integer larger than 0:");
			}
		} while (arrLength <= 0);

		arr = new int[arrLength];
		System.out.println("Please insert " + arrLength + " numbers:");

		// inserting integers in the array
		for (int i = 0; i < arr.length; i++) {
			do {
				try {
					System.out.printf("Element %d: ", i + 1);
					arr[i] = sc.nextInt();
					error = false;
				} catch (InputMismatchException e) {
					System.out.println("The input must be a integer number");
					
					if (i == 0) {
						i = 0;
					} else {
						i--;
					}
					sc.next();
				}
			} while (error);
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		printIncreasingNumbers(arr);
		sc.close();
	}

	private static void printIncreasingNumbers(int[] arr) {
		int position = 0;
		int maxSequence = 1;
		int counter = 1;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				counter++;
				if (counter > maxSequence) {
					maxSequence = counter;
					position = i - (maxSequence - 2);
				}
			}else {
				counter = 1;
			}
		}
		
		for (int i = position; i < maxSequence + position; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
