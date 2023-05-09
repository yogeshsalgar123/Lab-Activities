package Question8;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
	        int n = 12345;
	 
	        // Function call
	        System.out.println(getSum(n));
	    
	}
	 static int getSum(int n)
	    {
	        int sum = 0;
	 
	        while (n != 0) {
	            sum = sum + n % 10;
	            n = n / 10;
	        }
	 
	        return sum;
	    }

}
