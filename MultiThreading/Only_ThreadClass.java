import java.lang.Thread;

public class Only_ThreadClass extends Thread{

    @Override
 public void run(){
System.out.println("Thread start");
 }


 public static void main(String[] args) {
    Only_ThreadClass t = new Only_ThreadClass();
    t.start();  // it will call inbuit start()-> this will call run()
   // t.start();
 }

}















