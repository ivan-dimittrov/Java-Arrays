import java.util.Arrays;

public class JavaBookProblem14 {

	public static void main(String[] args) {
		int[] arr = { 453, 21, 3, 7, -1, 46, 65, 87, 987, 2, -5, 14, 16 };
		System.out.println("Unsorted: " + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] array) {
		if (array.length > 1) {
			int elementsArr1 = array.length / 2;
			int elementsArr2 = array.length - elementsArr1;

			int[] arr1 = new int[elementsArr1];
			int[] arr2 = new int[elementsArr2];

			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = array[i];
			}

			for (int i = elementsArr1; i < elementsArr1 + elementsArr2; i++) {
				arr2[i - elementsArr1] = array[i];
			}

			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);

			int indexArr = 0, indexArr1 = 0, indexArr2 = 0;

			while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
				if (arr1[indexArr1] < arr2[indexArr2]) {
					array[indexArr] = arr1[indexArr1];
					indexArr1++;
				} else {
					array[indexArr] = arr2[indexArr2];
					indexArr2++;
				}
				indexArr++;
			}

			while (indexArr1 < arr1.length) {
				array[indexArr] = arr1[indexArr1];
				indexArr1++;
				indexArr++;
			}

			while (indexArr2 < arr2.length) {
				array[indexArr] = arr2[indexArr2];
				indexArr++;
				indexArr2++;
			}
		}
		return array;
	}

}
