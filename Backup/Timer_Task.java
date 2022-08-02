import java.util.Calendar;  //import the Calendar class
import java.util.Timer;    //import the Timer class
import java.util.TimerTask;  //import the TimerTask class

public class Timer_Task {
	
	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//				for future execution in a background thread
		
		// TimerTask = 	A task that can be scheduled for one-time 
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			@Override
			public void run() {
				if(counter>0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("HAPPY NEW YEAR!");
					timer.cancel();
				}
			}		
		};
		
		Calendar date = Calendar.getInstance();  // get current date
		date.set(Calendar.YEAR,2022);
		date.set(Calendar.MONTH,Calendar.JULY);
		date.set(Calendar.DAY_OF_MONTH,18);
		date.set(Calendar.HOUR_OF_DAY,11);
		date.set(Calendar.MINUTE,46);
		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND,40);
		
		//timer.schedule(task, 0);
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
	}

}