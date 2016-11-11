import java.util.*;
public class JavaBookProblem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] letters = {'a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.print("Please enter one word: ");
		String word = sc.next().toLowerCase();
		char[] arr = word.toCharArray();
		char letter = '\0';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				letter = arr[i];
				int ascii = letter;
				if (letter == letters[j]) {
					System.out.printf("Letter: %s | Index: %d | Ascii code: %d\n",letter,j,ascii);
				}
			}
		}
		sc.close();
	}

}
