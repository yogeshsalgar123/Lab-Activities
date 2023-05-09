package Exception_handling;

import java.io.DataInputStream;
import java.io.IOException;

public class CheakedException {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dts =new DataInputStream(System.in);
		
		System.out.println("enter the string :");
		String str=dts.readLine();
	
		System.out.println(str);
		
		
	}

}
