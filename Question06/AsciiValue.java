package Question06;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter character :");
		char ch = sc.next().charAt(0);
		
		int asc = ch;
		System.out.println(asc);
		
		

	}

}
