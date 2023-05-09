package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchExc {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the two numbers to add :");
			int num1 = sc.nextInt();  //a
			int num2 = sc.nextInt();  //@ input mismatch Exception
			System.out.println(num1+num2);
			try 
			{
				int div=num1/num2;  //10/0
				System.out.println("inside inner  try ");
				
			}
			catch(Exception e) 
			{
				System.out.println(e);
				System.out.println("inside inner catch");
			}
			try {
				System.out.println("inside second inner try");
			}
			catch(Exception e)
			{
				System.out.println("inside second inner catch block");
			}
			
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
			System.out.println("inside outer catch block");
		}
	}

}
