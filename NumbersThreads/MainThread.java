package NumbersThreads;

public class MainThread {
	 public static void main(String[] args)throws InterruptedException {
		Numbers number1 = new Numbers(2);
		Thread thread1 = new Thread(number1);
		
		Numbers number2 = new Numbers(6);
		Thread thread2 = new Thread(number2);
		
		Numbers number3 = new Numbers(9);
		Thread thread3 = new Thread(number3);
		
		synchronized(thread1) {
			thread1.start();
			thread1.wait();
		}
		synchronized (thread2){
			thread2.start();
			thread2.wait();
		}
		thread3.start();
	}

}
