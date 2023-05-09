package Question19;

import java.util.Arrays;

public class StringDiv {
	public String stringDiv(String str1, String str2) {

		String substring[] = str1.split(str2); //to split a string into pieces 
		System.out.println(Arrays.toString(substring)); //store the pieces into array and print it

		//to find longest string among the pieces
		int maxLength = 0;
		String longestString = null;
		for (String i : substring) {
			if (i.length() > maxLength) {
				maxLength = i.length();
				longestString = i;
			}
		}	
		System.out.println(longestString);
		return longestString;
		

	}

}
