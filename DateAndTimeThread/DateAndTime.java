package DateAndTimeThread;

import java.time.LocalDateTime;

public class DateAndTime extends Thread{

	@Override
	public void run() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today's Date & Current Time : "+ dateTime+"  ==>> Printed by :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		DateAndTime dateAndTime1 = new DateAndTime();
		DateAndTime dateAndTime2 = new DateAndTime();
		DateAndTime dateAndTime3 = new DateAndTime();
		DateAndTime dateAndTime4 = new DateAndTime();
		DateAndTime dateAndTime5 = new DateAndTime();
		dateAndTime1.start();
		dateAndTime2.start();
		dateAndTime3.start();
		dateAndTime4.start();
		dateAndTime5.start();
		
	}	

}
