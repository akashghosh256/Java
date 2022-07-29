
// Thread 1
class MyThread extends Thread{

	@Override
	public void run() {
		
		for(int i =10;i>0;i--) {
			System.out.println("Thread #1 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is finished :)");
	}
}

// Thread 2
class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i =0;i<10;i++) {
			System.out.println("Thread #2 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is finished :)");
	}
}

public class Multi_Threading {
  
    public static void main(String[] args) throws InterruptedException{  

    	// Create a subclass of Thread
    	
        // There  are two methods of creating thread 1 by extend method and 2nd by runnable
    	// People generally use runnable to create thread
    	
    	MyThread thread1 = new MyThread();  // 1st creating threading by extend method
    	  
    	//or 
    	
    	// 2nd creating thread by using runnable
    	// implement Runnable interface and pass instance as an argument to Thread() 
    	MyRunnable runnable1 = new MyRunnable();
    	Thread thread2 = new Thread(runnable1);
    	
    	
    	//thread1.setDaemon(true);  // JVM terminates itself when all user threads (non-daemon threads) finish
        //thread2.setDaemon(true);  // their execution as soon as code is run as there is no user thread running
    	
    	
    	thread1.start();  // start threading 1
    	//thread1.join(); //calling thread (eg. main here) waits until the specified thread dies or for x milliseconds
    	thread2.start();  // start threading 2
    	
    	//System.out.println(1/0);
    } 
}