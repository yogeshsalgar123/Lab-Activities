package Question6;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter three numbers to calculate average :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		int avg = (num1+num2+num3)/3;
		System.out.println("average of the number is :" +avg);
		
	}

}
