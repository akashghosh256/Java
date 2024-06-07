

public class Runnable_Interface implements Runnable {
    
public void run(){
System.out.println("run start");
}

public static void main(String[] args) {
    Runnable_Interface r = new Runnable_Interface();
    Thread th = new Thread(r);
    th.start();
}






}
