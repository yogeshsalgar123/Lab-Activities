

// Swapping of two variables

package Question04;

public class SwapTwoVariables {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("before value of num1:" +num1 + "  before value of num2 :" + num2);
		
		int temp = num1;
		num1 = num2 ;
		num2 = temp;
		System.out.println("after value of num1:" +num1 + "  after value of num2 :" + num2);
		
		System.out.println("********************************");
		
		
		//  Swapping without using  third variable 
		int a=2;
		int b=4;
		System.out.println(" before value of a:" + a + "   before value of b : " + b);
		
		a = a+b;
		b = a-b; 
		a = a-b;
		System.out.println("after value of a:" + a + "  after value of b : " + b);
	}
	
}