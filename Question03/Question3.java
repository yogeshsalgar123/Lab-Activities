
//arranging array in ascending order

package Question03;

public class Question3 {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 9, 1 };
		int temp = 0;

		System.out.println("original array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(arr[i]);
			}
		}

		System.out.println("array in ascending order :");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
