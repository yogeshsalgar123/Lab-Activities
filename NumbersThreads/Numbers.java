package NumbersThreads;

public class Numbers implements Runnable{

	int data;
	//constructor
			public Numbers(int data) {
		this.data=data;
	}
	@Override
	public void run() {
		System.out.println("Thread Starts:");
		synchronized(this) {
			System.out.println("---Multiple of "+data+" is "+(data*data));
			this.notify();
		}
		System.out.println("Thread Ends.\n");
	}
}
