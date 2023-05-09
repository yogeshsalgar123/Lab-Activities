
      // middle character of String    
package Question02;

public class Question2 {

	public static void main(String[] args) {
		String str1=middle("YogeshSalgar");
		System.out.println(str1);
	}

	
	static String middle(String str)
	{
		int length = str.length();
		
			StringBuffer sb =new StringBuffer();
			sb.append(str.subSequence(length/2-1, length/2+1));
			
			String s = sb.toString();
		     return s;
	}
}
