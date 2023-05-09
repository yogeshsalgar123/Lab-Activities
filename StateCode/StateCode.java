package StateCode;

import java.util.HashMap;
import java.util.Map;

public class StateCode {
	public HashMap<String,String> getStateId(String [] str) {
		HashMap<String,String> map = new HashMap<>();
		int id =0;
		for(String s: str);{
		    id=1+id;
		//    map.put(str.toString().valueOf(id));
		}
	     return map;
	}
	public void display(HashMap<String, String> hashMap) {
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println("State : " + entry.getKey() + "\t" + "StateId :" + entry.getValue());
		}
	}
}
