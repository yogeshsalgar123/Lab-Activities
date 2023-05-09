package StateCode;

import java.util.HashMap;

public class TestStateCode {

	public static void main(String[] args) {

		StateCode code = new StateCode();
		String[]stateName= {"Maharashtra","UP","Gujrat","Telangana","Mp"};
		HashMap<String,String> map = code.getStateId(stateName); 
		code.display(map);
	}

}
