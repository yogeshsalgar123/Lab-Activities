package Question14;

public class SortArray {

	public static void main(String[] args) {
		
		sort();

	}

	
	// sort array elements
	public static void sort() {
		int[] arr = { 10, 90, 40, 20, 60, 30, 50 };

		// using bubble sort for sorting array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// printing sorted array
		for (int ar : arr) {
			System.out.println(ar + " ");
		}
	}

}
