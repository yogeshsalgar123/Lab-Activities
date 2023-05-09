
package Question07;

public class FizzBizz {
	
	public static void main(String[] args) {
		int num=9;
		
		for(int i=0;i<=100;i++)
		{
				if(num%3==0)
				{
					System.out.println("Fizz");
				}
				else if(num%5==0)
				{
					System.out.println("Buzz");
				}
				else if(num%3==0 || num%5==0)
				{
					System.out.println("Fizz Buzz");
				}
			
		}
		
	}
	
}