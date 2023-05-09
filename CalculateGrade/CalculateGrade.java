package CalculateGrade;

import java.util.HashMap;
import java.util.Map;

public class CalculateGrade {

	Map<String, String> calculateGrade(Map<String, Float> map) {
		
		Map<String, String> grades = new HashMap<String, String>();
		
		for (Map.Entry<String, Float> s : map.entrySet()) 
		{
			if (s.getValue() > 60) 
			{
			   grades.put(s.getKey(), "Pass");
			} 
			else if (s.getValue() < 60) 
			 {
			  grades.put(s.getKey(), "Fail");
			  }
		}
		return grades;
	}

}
