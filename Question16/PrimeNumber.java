package Question16;

public class PrimeNumber {
	public static void checkPrime(int num) {
		int div = 0, res = 0;
		div = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");

		} else {
			for (int i = 2; i < div; i++) {
				if (num % i == 0) {
					res = 1;
					break;

				}
			}
			if (res == 0)
				System.out.println(num + "is a prime number");

			else
				System.out.println(num + "is not a prime number");
		}
	}

	public static void main(String[] args) {
		checkPrime(11);
	}

}
