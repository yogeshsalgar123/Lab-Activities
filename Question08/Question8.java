package Question08;

public class Question8 {
	public String exceptFirstTwo(String str) 
	{   
	  int len = str.length();
	  String temp = "";
	  for (int i = 0; i < len; i++) 
	  {
	    if (i == 0 && str.charAt(i) == 'k')
	      temp += 'k';
	    else if (i == 1 && str.charAt(i) == 'b')
	      temp += 'b';
	    else if (i > 1)
	      temp += str.charAt(i);
	  }
	    return temp;
	}
	
	public static void main(String[] args) {
		
		Question8 obj = new Question8();
		String str = "ajcjdks";
		System.out.println(str);
		System.out.println(obj.exceptFirstTwo(str));
	}

}
