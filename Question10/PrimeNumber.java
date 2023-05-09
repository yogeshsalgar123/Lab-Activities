package Question10;

public class PrimeNumber {

	public static boolean checkprime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;

		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(checkprime(3));
	}

}
