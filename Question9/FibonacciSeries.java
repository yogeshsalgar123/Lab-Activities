
//  0,1,1,2,4,5,7,9,13,17,19,21

package Question9;

public class FibonacciSeries {

	public static void findFibonacciSeies(int upperLimit) {
		int firstNumber = 0, secondNumber = 1;
		int thirdNumber = 0;

		// third number is sum of firstNumber and Second number
		// Assign the value of second number into first number and third number into 2nd
		// number

		while (thirdNumber < upperLimit) {
			thirdNumber = firstNumber + secondNumber;
			System.out.print(thirdNumber + " ");
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

	public static void main(String[] args) {
		findFibonacciSeies(30);
	}

}
