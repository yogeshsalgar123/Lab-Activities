package Exception_handling;

public class NestedTryDemo {

	public static void main(String[] args) {
		try {
			System.out.println("inside first try");
			try {
				System.out.println("inside second  try");
			} catch (Exception e) {
				System.out.println("inside first catch block");
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("inside third try");
			} catch (Exception e1) {
				System.out.println("inside second catch block");
				System.out.println(e1.getMessage());
			}
			try {
				System.out.println("inside fourth try block");
			} catch (Exception e2) {
				System.out.println("inside third catch block");
				System.out.println(e2.getMessage());
		  }
		   } 
		finally {
			System.out.println("inside finally block");
		}

	}
}
