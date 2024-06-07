class Sleep_Method extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
            for(int i =10; i>=5; i--){
                try{
                Thread.sleep(1000);
                }
                catch(Exception e){
                    // void java.lang.Thread.sleep(long millis) throws InterruptedException
                    System.out.println(e);
            
                }
                System.out.println(i);
            }
        }
     
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        try{
        for(int i =1; i<=5; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
    catch(Exception e){
        // void java.lang.Thread.sleep(long millis) throws InterruptedException
        System.out.println(e);

    }

    Sleep_Method t = new Sleep_Method();
    t.start();
        
    }
}