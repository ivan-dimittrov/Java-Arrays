import java.util.*;
public class JavaBookProblem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k , sum = 0;
		boolean error = true;
		
		System.out.println("Enter the length of the array and one positive integer:");
		do {
			try {
				System.out.print("Length of array N: ");
				n = sc.nextInt();
				System.out.print("One positive integer K smaller than N: ");
				k = sc.nextInt();
			} catch (InputMismatchException e) {
				n = 0;
				k = 0;
				sc.next();
			}
			if (n <= 0) {
				System.out.println("The input must be a positive integer larger than 0:");
			}
			if (k <= 0 || k > n) {
				System.out.println("K must be a positive integer equal or smaller than N");
			}
		} while (n <= 0 || (k <= 0 || k > n));
		
		int[] arr = new int[n];
		
		System.out.println("---------------------------------");
		System.out.println("Please insert " + n + " numbers:");
		// inserting elements in the array
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
			
		Arrays.sort(arr);
		System.out.print("The elements with max sum are: ");
		
		for (int i = arr.length - 1; i >= arr.length - k; i--) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		sc.close();
	}

}
