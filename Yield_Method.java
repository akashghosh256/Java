// The yield() basically means that the thread is not doing anything particularly important and if any other threads or processes
// need to be run, they should run. Otherwise, the current thread will continue to run.


public class Yield_Method extends Thread {
    

    public void run(){
        Thread.yield();

        for(int i=0; i<5; i++){
            System.out.println(i+": "+Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {

        Yield_Method t = new Yield_Method();
        t.start();

      //  Thread.yield();
        for(int i=0; i<5; i++){
            System.out.println(i+": "+Thread.currentThread().getName());
        }

        
    }


    
}
