



class Medical extends Thread{
    public void run(){
        System.out.println("Medical start");
        try{
        Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Medical complete");


    }
}




class Drive extends Thread{
    public void run(){
        System.out.println("Drive start");
        try{
        Thread.sleep(2000);
        }
        catch(Exception e){
          System.out.println(e);
        }
        System.out.println("Drive complete");

    }
}



class Officer extends Thread {
    private Thread driveThread;

    public Officer(Thread driveThread) {
        this.driveThread = driveThread;
    }

    public void run() {
        System.out.println("Officer asking for drive ");
        driveThread.start();
        try {
            driveThread.join(); // Wait for the Drive thread to complete
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Officer start");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Officer complete");
    }
}





public class DrvingLicence_MultithreadJoin extends Thread {
    static  Thread drive;
    public static void main(String[] args) throws InterruptedException {
        // main thread waits for each thread to complete the process

        Medical medical = new Medical();
        medical.start();
        medical.join();

        drive = new Drive();
       // drive.start();
       // drive.join();

        Officer officer = new Officer(drive);
        officer.start();
            
       
        
    }
    
}
