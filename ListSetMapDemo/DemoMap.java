package ListSetMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(301, "yogesh");
		map.put(102, "ankesh");
		map.put(201, "Abhiranjan");
		
		System.out.println(map);
		
		for (String string : args) {
			System.out.println(map);
		}
		
		map.entrySet();//to convert map into set
		
		System.out.println(map.entrySet());
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
