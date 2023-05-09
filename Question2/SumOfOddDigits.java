package Question2;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		System.out.println("please enter the number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		int temp=num;
		int sum=0;
			while(temp>0)
			{
				num = temp%10;
				temp = temp/10;
				if(num%2==1)
				{
					sum = sum+num;
				}
			}
			System.out.println(sum);
		
	}

}
