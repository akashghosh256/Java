public class Multi_Thread extends Thread {

    public void run(){
            for(int i =10; i>=5; i--){
                try{
                Thread.sleep(1000);
                }
                catch(Exception e){
                    // void java.lang.Thread.sleep(long millis) throws InterruptedException
                    System.out.println(e);
            
                }
                System.out.println(i+": "+ Thread.currentThread().getName());
                ;
            }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

// multi thread- eg VLC player one thread palys video other plays sound etc here 
// multi threading  is important to have good synchronization
// thread 0
//   Multi_Thread t1 = new Multi_Thread();
//   t1.start();
// // thread 1
//   Multi_Thread t2 = new Multi_Thread();
//   t2.start();



// Just a normal method - if its directly call run()
  Multi_Thread t1 = new Multi_Thread();
  t1.run();
  Multi_Thread t2 = new Multi_Thread();
  t2.run();


        
    }
}
