package ThreadDemo;

public class Thread1 implements Runnable{
  int sum=0;
  
  @Override
  public void run() {
	  //task for thread 1 - calculate the sum of 1 to 10.
	  synchronized(this) {
		  for(int i=1; i<=10; i++) {
			  sum+=1;
		  }
		  this.notify();
	  }
  }
}
