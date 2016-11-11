import java.util.Arrays;


public class JavaBookProblem03 {

	public static void main(String[] args) {
		char[] arr = new char[]{'a','b','a','f'};
		char[] arr2 = new char[]{'Q','c','b','d','p'};
		
		checkLexiOrder(arr, arr2);
	}
	
	private static void checkLexiOrder(char[] arr, char[] arr2){
		int arrCounter = 0;
		int arr2Counter = 0;
		
		if (arr.length > 0 && arr2.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				try {
					if (Character.toLowerCase(arr[i]) < Character.toLowerCase(arr2[i])) {
						arrCounter++;
					}else if(Character.toLowerCase(arr[i]) > Character.toLowerCase(arr2[i])){
						arr2Counter++;
					}
				} catch (IndexOutOfBoundsException e) {
					break;
				}
			}
			if (arrCounter == arr2Counter) {
				System.out.println("The arrays are equal according to the lexicographic order");
			}else {
				System.out.println((arrCounter > arr2Counter) ? Arrays.toString(arr) + " is earlier in lexi order" :
					Arrays.toString(arr2) + " is earlier in lexi order");
			}
			
		}else {
			System.out.println("Some of the arrays is empty");
		}
		
	}

}
