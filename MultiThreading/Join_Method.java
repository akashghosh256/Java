public class Join_Method extends Thread {
    static Thread mainthread;


    public void run(){

        try{
            mainthread.join();
        }
        catch(Exception e){
            System.out.println(e);
        }



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


    public static void main(String[] args) throws InterruptedException {

        mainthread = Thread.currentThread();   // referenc for main thread, now i want child thread to wait for main, 
        // so i will use join in child thread so that child wait for main to complete

        Join_Method t = new Join_Method();
        t.start();
   //     t.join();   // main thread waits for child thread here

        for(int i =10; i>=5; i--){
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
       
                System.out.println(e);
        
            }
            System.out.println(i+": "+ Thread.currentThread().getName());
            ;
        }

        
    }
}
