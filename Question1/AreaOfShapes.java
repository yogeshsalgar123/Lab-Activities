package Question1;

public class AreaOfShapes {
	
	
	public static void areaOfTriangle(int base , int height )
	{
		double aot =0.5 * base * height;
		System.out.println(aot);
	}
	
	public static void areaOfSquare(int a , int lengthOfSides)
	{
		double aos = (a^2) * (lengthOfSides^2);
	//	double aos1 = Math.sqrt(a) * Math.sqrt(lengthOfSides);
		System.out.println(aos);
	}
	
	public static void areaOfCircle(int r)
	{
		double aoc = 3.14 * (r^2);
		System.out.println(aoc);
	}
	
	public static void areaOfReactangle(int width, int height)
	{
		double aor = width * height ;
		System.out.println(aor);
	}

	public static void main(String[] args) {
		areaOfTriangle(5, 10);
		areaOfSquare(2, 4);
		areaOfCircle(7);
		areaOfReactangle(2, 5);
		
		
	}

}
