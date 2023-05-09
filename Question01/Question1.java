
 // smallest number among three numbers

package Question01;

public class Question1 {

	public static void main(String[] args) {
		
		int sm=smallest(4,9,2);
		System.out.println(sm);
		
	}

     static int smallest(int a,int b,int c)
	{
		int s = (a<b)?a:b;
		int smallest = (s<c)?s:c;
		return smallest;
		
	}
}
