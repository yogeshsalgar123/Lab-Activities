
     
       
     // Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise.
package Question06;

public class Question6 {
	
	public static void isPalindrome(String str)
	{
		 String rev="";
	     for(int i=str.length()-1; i>=0; i--)
	     {
	    	 rev=rev+str.charAt(i);
	     }

	     System.out.println("original String : " +str);
	     System.out.println("reversed String : " +rev);
	     
	     if(str.equals(rev))
	     {
	    	 System.out.println("Yes");
	     }
	     else{
	    	System.out.println("No"); 
	     }
	}
	
	public static void main(String[] args) {
		
		isPalindrome("madam");
	
		
	}

}
