
// ArrayList is a part of collection framework and is present in java.util 
//package. 
// It provides us with dynamic arrays in Java.
import java.util.*; 
  
class Arraylist { 
    public static void main(String[] args) 
    { 
        // Size of the 
        // ArrayList 
        int n = 5; 
  
        // Declaring the ArrayList with 
        // initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(); 
  
        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 

        
        // Reverse the ArrayList
        Collections.reverse(arrli);
  
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.print(arrli.get(i) + " "); 
    } 
} 
