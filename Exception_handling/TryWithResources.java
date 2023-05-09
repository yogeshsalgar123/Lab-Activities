package Exception_handling;

import java.io.DataInputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		DataInputStream dts = new DataInputStream(System.in);
		dts.readLine();
	}

}
