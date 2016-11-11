public class JavaBookProblem13 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 22, 23 };
		System.out.println("Position of the searched number: " + binarySearch(arr, 9, 0, arr.length - 1));
	}

	static int binarySearch(int[] arr, int x, int left, int right) {
		int mid = (left + right) / 2;
		if (left > right) {
			return -1;
		}
		if (arr[mid] == x) {
			return mid;
		} else {
			if (x > arr[mid]) {
				left = mid + 1;
				return binarySearch(arr, x, left, right);
			} else {
				right = mid - 1;
				return binarySearch(arr, x, left, right);
			}
		}
	}
}
