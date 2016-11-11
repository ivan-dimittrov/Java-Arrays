import java.util.*;
public class JavaBookProblem02 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int firstArrLenght;
		int secondArrLenght;
		
		
		do {
			System.out.print("Enter the length of the first array:");
			firstArrLenght = sc.nextInt();
			System.out.print("Enter the length of the second array:");
			secondArrLenght = sc.nextInt();
			
			if (firstArrLenght <= 0 ) {
				System.out.println("You have entered a negative number or zero for the length of"
						+ " the first array.");
				System.out.print("Please enter a positive number: ");
				firstArrLenght = sc.nextInt();
			}
			
			if (secondArrLenght <= 0) {
				System.out.println("You have entered a negative number or zero for the length of"
						+ " the second array.");
				System.out.print("Please enter a positive number: ");
				secondArrLenght = sc.nextInt();
			}
			
		} while (firstArrLenght <= 0 || secondArrLenght <= 0);
		System.out.println("------------------------------------");
		
		int[] arr = new int[firstArrLenght];
		int[] arr2 = new int[secondArrLenght];
		insertElements(arr, arr2);
		
		if (checkForEqualArrays(arr, arr2)) {
			System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are not equal");
		}
	}
	
	private static boolean checkForEqualArrays(int[] arr, int[] arr2){
		boolean equal = false;
		if (arr.length == arr2.length) {
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr2[i]) {
					equal = true;
				} else {
					equal = false;
					break;
				}
			}
		}else {
			equal = false;
		}
		return equal;
	}
	
	private static void insertElements(int[] arr, int[] arr2){
		System.out.print("Enter the elements of the first array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the elements of the second array: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
	}
}
