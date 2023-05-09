package Question16;

public class FizzBizz {
public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%3 ==0) {
				// Fizz will print if number is  divisible by three only
                // Fizzbuzz will print if both of the condition will satisfied
				System.out.println((i%5==0)? " FizzBuzz": "Fizz");
			}
			else {
				if (i%5==0) {
					//Buzz will print if number is divisible by five
					System.out.print("Buzz");
				}
				else {
					// none of condition satisfied
					System.out.println(" "+i);
				}
			}
			
		}
	}
}
