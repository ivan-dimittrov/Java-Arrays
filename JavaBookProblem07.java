public class JavaBookProblem07 {

	public static void main(String[] args) {
		int[] arr = { 12, 41, 54, 4, 5, 9, 34 };
		selectionSort(arr);
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < (arr.length - 1) / 2; i++) {
			int max = arr[i];
			int maxIndex = i;
			int min = arr[i];
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length - i; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
				if (arr[j] > max) {
					max = arr[j];
					maxIndex = j;
				}
			}

			int temp2 = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = max;
			arr[maxIndex] = temp2;

			if (minIndex == arr.length - 1 - i) {
				minIndex = maxIndex;
			}

			int temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}
	}
}
