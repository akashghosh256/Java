public class Is_Interrupted extends Thread {
    public void run(){
       System.out.println("A: "+Thread.interrupted());  // changes state from true to false, makes the execution possible
      //  System.out.println(Thread.currentThread().isInterrupted());  //doesnt change the state true remains true
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("B: "+Thread.interrupted());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Is_Interrupted t = new Is_Interrupted();
        t.start();
       // t.interrupt();
       
       

        
    }
}
