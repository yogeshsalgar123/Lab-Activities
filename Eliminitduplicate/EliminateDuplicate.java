package Eliminitduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicate {
	
public static void main(String[] args) {
		
		String arr[]= {"sunil","sai","pavan","vijay","sai","Sunil","Pavan"};
		
		Set<String>set=new HashSet<String>(Arrays.asList(arr));
		
		String str[]=new String[set.size()];
		set.toArray(str);
		
		Arrays.sort(str);
		
		for(String elements:str) {
			System.out.println(elements);
		}	
	}
}
