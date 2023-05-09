package Question17;

public class Delimeter {
	public static void main(String[] args) {
		 String str = "yogesh@salgar@hello@world";
	        String[] arrOfStr = str.split("@", 2);
	  
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }
	}

