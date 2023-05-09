package ListSetMapDemo;

import java.util.HashSet;

public class DemoSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("yogesh");
		set.add(25);
		set.add(10.00);
		set.add(true);
		set.add(12.0f);
		set.add('A');
		set.add("yogesh");
		System.out.println(set);
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(9);
		set1.add(1);
		set1.add(3);
		set1.add(7);
		System.out.println(set1);
	}
}
