//Trying to book seat for movie for many users at a time

// class BookTheater_Seat{
//     int total_seats = 10;

//     void bookseat(int seats){
//         if( seats <= total_seats){
//             total_seats -= seats;
//             System.out.println(seats+" booked successfully");
//             System.out.println("Seats Left: "+ total_seats);
//         }
//         else{
//             System.out.println("Seats can't be booked for "+ seats + " Available: "+total_seats);
//         }
//     }


// }


// public class MovieSeat_Booking extends Thread {
//     static  BookTheater_Seat b;
//     int seats;

//     public void run(){

//         b.bookseat(seats);
//     }

//     public static void main(String[] args) {
//          b = new BookTheater_Seat();
//         MovieSeat_Booking person1 = new MovieSeat_Booking();
//         person1.seats = 6;
//         person1.start();

//         MovieSeat_Booking person2 = new MovieSeat_Booking();
//         person2.seats = 7;
//         person2.start();
        
//     }
// }


// Execution is not in order
// 7 booked successfully
// Seats Left: 3
// Seats can't be booked for 6 Available: 3


//------------------------------------------ using Synchronized method in Java Multithreading----------------------------------


// class BookTheater_Seat{
//     int total_seats = 10;

//     // just added synchronized keyword 

//  synchronized  void bookseat(int seats){
//         if( seats <= total_seats){
//             total_seats -= seats;
//             System.out.println(seats+" booked successfully");
//             System.out.println("Seats Left: "+ total_seats);
//         }
//         else{
//             System.out.println("Seats can't be booked for "+ seats + " Available: "+total_seats);
//         }
//     }


// }


// public class MovieSeat_Booking extends Thread {
//     static  BookTheater_Seat b;
//     int seats;

//     public void run(){

//         b.bookseat(seats);
//     }

//     public static void main(String[] args) {
//          b = new BookTheater_Seat();
//         MovieSeat_Booking person1 = new MovieSeat_Booking();
//         person1.seats = 6;
//         person1.start();

//         MovieSeat_Booking person2 = new MovieSeat_Booking();
//         person2.seats = 7;
//         person2.start();
        
//     }
// }


//-------------------Synchronized Block || Multithreading in Java by Deepak (Hindi)-------------------------------------------



// class BookTheater_Seat{
//     int total_seats = 10;

//      void bookseat(int seats){
//         System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//         System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//         System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//         System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
        
// //Synchronized Block || Multithreading in Java by Deepak (Hindi)
//     synchronized(this){
//         if( seats <= total_seats){
//             total_seats -= seats;
//             System.out.println(seats+" booked successfully");
//             System.out.println("Seats Left: "+ total_seats);
//         }
//         else{
//             System.out.println("Seats can't be booked for "+ seats + " Available: "+total_seats);
//         }
//     }

//     System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//     System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//     System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());
//     System.out.println("10,000 Lines of code - Thread Is : "+ Thread.currentThread().getName());

//     }

// }


// public class MovieSeat_Booking extends Thread {
//     static  BookTheater_Seat b;
//     int seats;

//     public void run(){

//         b.bookseat(seats);
//     }

//     public static void main(String[] args) {
//          b = new BookTheater_Seat();
//         MovieSeat_Booking person1 = new MovieSeat_Booking();
//         person1.seats = 6;
//         person1.start();

//         MovieSeat_Booking person2 = new MovieSeat_Booking();
//         person2.seats = 7;
//         person2.start();
        
//     }
// }


//-----------------------------Static Synchronization in Java Multithreading by Deepak-------------------------
class BookTheater_Seat{
   static int total_seats = 10;

 //  Static Synchronization in Java Multithreading by Deepak
 static synchronized void bookseat(int seats){
        if( seats <= total_seats){
            total_seats -= seats;
            System.out.println(seats+" booked successfully: "+ Thread.currentThread().getName() );
            System.out.println("Seats Left: "+ total_seats);
        }
        else{
            System.out.println("Seats can't be booked for "+ seats + " Available: "+ total_seats +" & "+ Thread.currentThread().getName());
        }
    }


}

class MyThread1 extends Thread{
    BookTheater_Seat b;
    int seats;

    MyThread1(BookTheater_Seat b, int seats){
        this.b = b;
        this.seats = seats;

    }
    public void run(){
        b.bookseat(seats);
    }
}

class MyThread2 extends Thread{
        BookTheater_Seat b;
    int seats;

    MyThread2(BookTheater_Seat b, int seats){
        this.b = b;
        this.seats = seats;

    }
    public void run(){
        b.bookseat(seats);
    }
}




public class MovieSeat_Booking extends Thread {


    public static void main(String[] args) {

        // object 1
        BookTheater_Seat b1 = new BookTheater_Seat();
        MyThread1 t1 = new MyThread1(b1, 2);
        t1.start();

        MyThread1 t2 = new MyThread1(b1, 3);
        t2.start();



// object 2
        BookTheater_Seat b2 = new BookTheater_Seat();
        MyThread2 t3 = new MyThread2(b2, 4);
        t3.start();

        MyThread2 t4 = new MyThread2(b2, 7);
        t4.start();

   
        
    }
}
























