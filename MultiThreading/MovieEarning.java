// https://www.youtube.com/watch?v=1fy0qaYup5Q&list=PLlhM4lkb2sEh1pBs0KBb63PlKKqRx6M1a&index=23


// class TotalEarnings extends Thread{

//     int total = 0;
//     public void run(){

//         for(int i=1; i<=100; i++){
//             total += 100;
//         }

//     }
// }




// public class MovieEarning {
//     public static void main(String[] args) {

//         TotalEarnings t = new TotalEarnings();
//         t.start();
//         System.out.println(t.total);
        
//     }
    
// }



// ----------------------- Sloution Multithreading InterThread Communication | wait(), notify() and notifyAll() Method by Deepak----------------------------




class TotalEarnings extends Thread{

    int total = 0;
    public void run(){

        synchronized(this){

        for(int i=1; i<=100; i++){
            total += 100;
        }
        this.notify();
    }

    }
}




public class MovieEarning {
    public static void main(String[] args) throws InterruptedException{

        TotalEarnings t = new TotalEarnings();
        t.start();
       // System.out.println(t.total);

       synchronized(t){
        t.wait();   // also you can add wait timelimit
        System.out.println(t.total);


       }


        
    }
    
}













