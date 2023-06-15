// Note - Code is correct, but it will not run vs code, it will run in eclipse.


class MyThread extends Thread {

    @Override
    public void run() {

        if (this.isDaemon()) {
            System.out.println("This is a daemon thread that is running");
        } else {
            System.out.println("This is a user thread that is running");
        }
    }
}


public class Threads_in {

    public static void main(String[] args) throws InterruptedException {

        /*
         * thread = A thread of execution in a program (kind of like a virtual CPU)
         * The JVM allows an application to have multiple threads running concurrently
         * Each thread can execute parts of you code in parallel with the main thread
         * Each thread has a priority.
         * Threads with higher priority are executed in preference compared to threads
         * with a lower priority
         * 
         * The Java Virtual Machine continues to execute threads until either of the
         * following occurs
         * 1. The exit method of class Runtime has been called
         * 2. All user threads have died
         * 
         * When a JVM starts up, there is a thread which calls the main method
         * This thread is called “main”
         * 
         * Daemon thread is a low priority thread that runs in background to perform
         * tasks such as garbage collection
         * JVM terminates itself when all user threads (non-daemon threads) finish their
         * execution
         */

         System.out.println("Number of threads "+Thread.activeCount());

        Thread.currentThread().setName("MAIN AKASH");
        System.out.println(Thread.currentThread().getName());  

        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());


    	/*
          for(int i =3;i>0;i--) {
          System.out.println(i);
          Thread.sleep(1000);
          }
         
          System.out.println("You are done!");
        */ 
		
         MyThread thread2 = new MyThread();

         thread2.setDaemon(true);  // You can set the thread as a daemon thread
         // can be change to false to make it a user thread

         System.out.println("thread2.isDaemon() "+thread2.isDaemon());

         thread2.start();
         System.out.println("thread2.isAlive() "+thread2.isAlive());

        // thread2.setName("2nd thread");
        // System.out.println(thread2.getName());

        // thread2.setPriority(1);
        // System.out.println(thread2.getPriority());

        // System.out.println(Thread.activeCount());
    }
}
