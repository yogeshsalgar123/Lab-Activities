package ThreadDemo;

public class ThreadMain {

	// run all threads
	public static void main(String[] args) throws InterruptedException {
			//thread1
			Thread1 t1 = new Thread1();
			Thread thread_1 = new Thread(t1);
			
			//starting all threads
			thread_1.start();
			
			synchronized(thread_1) {
				// putting main thread in block state until notification comes.
			      thread_1.wait();
			      System.out.println("Thread 1 -sum(1-10): "+t1.sum);
			}
			
		}
}
