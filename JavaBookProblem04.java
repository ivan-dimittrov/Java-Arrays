import java.util.*;
public class JavaBookProblem04 {

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
			printSequenceOfEqualElements(arr);
			sc.close();
	}

	private static void printSequenceOfEqualElements(int[] arr) {
		int counter = 1;
		int num = arr[0];
		int maxSeq = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				counter++;
				if (counter > maxSeq) {
					maxSeq = counter;
					num = arr[i];
				}
			} else {
				counter = 1;
			}
		}
		
		// printing the sequence
		if (maxSeq == 0) {
			System.out.println("There isn't identical elements.");
		}else {
			System.out.print("{ ");
			for (int i = 0; i < maxSeq; i++) {
				System.out.print(num + " ");
			}
			System.out.print("}");
		}
		
	}
}
