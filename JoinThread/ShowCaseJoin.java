package JoinThread;

public class ShowCaseJoin implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=3;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Current Thread "+ Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ShowCaseJoin scj1 = new ShowCaseJoin();
		ShowCaseJoin scj2 = new ShowCaseJoin();
		Thread t1 = new Thread(scj1);
		Thread t2 = new Thread(scj2);
		t1.start();
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
