class Daemon_thread extends Thread {
    public void run(){
        System.out.println("Daemon thread yo");
        System.out.println(Thread.currentThread().getName());

    }


public static void main(String[] args) {


  //  Thread.currentThread().setDaemon(true);
    System.out.println(Thread.currentThread().getName());

    Daemon_thread t = new Daemon_thread();
    t.setDaemon(true);
    t.start();

}
}