package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("please enter two numbers");
			int num1=sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(InputMismatchException i) {
			System.out.println(i);
			
		}
	}

}
