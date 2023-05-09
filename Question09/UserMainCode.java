package Question09;

public class UserMainCode {
	
	static String reshape(String str)
	{
		char [] ch = str.toCharArray();  //string to char
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		return str ;
		
	}

}
