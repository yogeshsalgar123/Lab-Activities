package ArrayListThreads;

import java.util.ArrayList;

public class SafelyArrayList implements Runnable{
	private int sum =0;
	private static ArrayList<String>List = new ArrayList<>();
    @Override
    public void run() {
    	//Taking Task for thread
    	synchronized(this) {
    		for(int i=1;i<=10;i++) {
    			sum+=i;
    			List.add(String.valueOf(i));
    		}
    		//sending the notification to the main thread
    		this.notify();
    	}
    }
    //get sum
    public int getsum() {
    	return sum;
    }
    //get ArrayList elements
    public ArrayList<String> GetList(){
    	return List;
    }
}
