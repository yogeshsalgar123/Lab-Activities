package Question13;

public class StackImp implements Stack {
	
	public void push()
	{
		System.out.println("inside push method");
	}
	
	public void pop()
	{
		System.out.println("inside pop method");
	}
	
	public static void main(String[] args) {
		
		StackImp st =new StackImp();
		st.push();
		st.pop();
	}

}
