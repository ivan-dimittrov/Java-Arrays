import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SpecularArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length of the array:");
		boolean error = true;
		int n;

		do {
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				n = 0;
				sc.next();
			}
			if (n <= 0) {
				System.out.println("Please enter a positive integer larger than 0: ");
			}
		} while (n <= 0);

		int[] arr = new int[n];
		
		System.out.printf("Please enter %d digits: \n",n);
		
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
	
		System.out.println(Arrays.toString(arr));

		if (arr.length % 2 != 0) {
			System.out.println("The array cannot be specular. The length is a odd number.");
		} else {
			boolean equal = false;
			
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] == arr[arr.length - 1 - i]) {
					equal = true;
				} else {
					equal = false;
					break;
				}
			}
			System.out.println(equal ? "The array is specular" : "The array is not specular");
		}
		sc.close();
	}

}
