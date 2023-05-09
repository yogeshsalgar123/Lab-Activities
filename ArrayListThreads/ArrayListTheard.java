package ArrayListThreads;

public class ArrayListTheard {

	public static void main(String[] args) throws InterruptedException {
		SafelyArrayList t1= new SafelyArrayList();
		Thread thread = new Thread(t1);
		
		thread.start();
		
		synchronized(thread){
			//putting main thread in waiting state
			thread.wait();
			
			//after getting notification execute bellow code.
			System.out.println("--> Sum(1-10): " +t1.getsum());
			System.out.println("--ArrayList Elements: ");
			t1.GetList().stream().forEach(e-> System.out.print(e+" "));
			
		}
	}

}
