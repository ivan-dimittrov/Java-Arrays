import java.util.Arrays;

public class JavaBookProblem15 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 1, 8, 3, 7, 4, 5 };
		System.out.println("Array before quick sort: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Array after quick sort: " + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = end;
		int k = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= arr[pivot]) {
				swap(arr, i, k);
				k++;
			}
		}
		swap(arr, pivot, k);
		return k;
	}

	private static void swap(int[] arr, int elem1, int elem2) {
		int temp = arr[elem1];
		arr[elem1] = arr[elem2];
		arr[elem2] = temp;
	}

}
