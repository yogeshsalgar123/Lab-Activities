package Exception_handling;

import java.util.Scanner;

public class GlobalException {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter numbers :");
		int num = sc.nextInt();   // a input mismatch
		int num2 =sc.nextInt();
		System.out.println(10/2);  //Arithmatic Exception
		String str = "hello";
		str.charAt(8);   // String index outof bound exception
		
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
