package LargeKey;

import java.util.HashMap;
import java.util.TreeMap;

public class LargeKey {
	
	public void getTheLargeKeyValue(HashMap<Integer,String>hm) {
		TreeMap<Integer,String>tm=new TreeMap<>(hm);
		//System.out.println(hm.keySet()); //[105 107 109]
		
		System.out.println("Large Key ="+tm.lastKey());
		
	}

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(107,"yogesh");
		hm.put(105,"ankesh");
		hm.put(109,"vibhor");
		
		LargeKey lk=new LargeKey();
		lk.getTheLargeKeyValue(hm);
	}
}

