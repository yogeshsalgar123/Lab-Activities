package Question5;

public class Swap {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		System.out.println("value a & b :" +a +" " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value a & b :" +a +" " + b);
	}

}
