
   // prime or not 

package Question05;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 13;
		int i;
		
	    for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				break;
			}
		}
			
			if(i==num)
			{
				System.out.println("number is prime");
			}
			else{
				System.out.println("number is not prime");
			}
		
	}
	
}