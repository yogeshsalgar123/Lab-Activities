package CalculateGrade;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolGrades {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n=sc.nextInt();
		
		Map<String,Float> map =new HashMap<String,Float>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the"+" "+"student name of"+" "+(i+1)+ " "+"Student");
			String name=sc.next();
			System.out.println("Enter the"+" "+"student Marks of"+" "+(i+1)+ " "+"Student");
			Float marks=sc.nextFloat();
			
			map.put(name, marks);
		}
		System.out.println(map);
		
		 CalculateGrade main=new CalculateGrade();
		 System.out.println(main.calculateGrade(map));
	
	}
}
