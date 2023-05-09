package Exception_handling;

public class Clean_upFinally {

	public static void main(String[] args) {
		try
		{
		System.out.println("inside try block");
	     int arr[] = {1,2,4,3,5};
	     for(int i=0;i<=arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("inside catch block");
		System.out.println(e);
		}
		finally
		{
		System.out.println("inside finally block");
		}

	}
}
