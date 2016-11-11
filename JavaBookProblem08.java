public class JavaBookProblem08 {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
		int count = 1;
		int mostCommon = 0;
		int maxCount = 1;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					if (count > maxCount) {
						maxCount = count;
						mostCommon = arr[i];
					}
				}
			}
			count = 1;
		}
		System.out.println(mostCommon);
		System.out.println(maxCount + " Times");
	}

}
