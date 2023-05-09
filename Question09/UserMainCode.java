package Question09;

public class UserMainCode {
	// 56895
	public static int sumOfSquareOfEvenDigits(int number) {
		int rem = 0;
		int sum = 0;

		while (number != 0) {
			rem = number % 10;
			if ((rem % 2) == 0)
				sum += rem * rem;
			number /= 10;
		}
		
		return sum;
	}

}
