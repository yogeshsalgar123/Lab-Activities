package SortNString;

import java.util.ArrayList;
import java.util.Scanner;

public class SortTheNstrings {

	public void displaySortedString(ArrayList<String> al) {
		al.sort(null);
		al.toString();
		System.out.println(al);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Strings.....");
		int n = sc.nextInt();
		getTheList(n);

	}

	private static void getTheList(int n) // to store arrayList
	{
		ArrayList<String> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the string " + i);
			String str = sc.nextLine();
			al.add(str);
		}
		SortTheNstrings s = new SortTheNstrings();
		s.displaySortedString(al);
	}

}
