/*
 Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters 
and returns a value. Lambda expressions are similar to methods,
but they do not need a name and they can be implemented right in the body of a method.
link : https://www.javatpoint.com/java-lambda-expressions

 */

//---------------------------------------------------------------------------------------

/* 
                                     WRITTEN BY ME TO UNDERSTAND THE LAMBDA CONCEPT :)
 // without lambda expression----------------------------------------------------
 
 interface Printable{
    void print(String Suffix);
 }


class Lion implements Printable{
    public void print(String suffix){
        System.out.println("lion " + suffix);
    }
}


public class fire{
    public static void main(String[] args) {
        Lion lion = new Lion();
        printThing(lion);
    }
    
    static void printThing(Printable p){
        p.print("Roarrrrr");
    }

}
// OUTPUT : lion Roarrrrr


// with lambda expression----------------------------------------------------
// Here we are printing statements without creating Lion class 
// and implementing Printable interface

 interface Printable{
    void print(String suffix);
}


public class fire{
public static void main(String[] args) {

Printable lambdaprint = (s) -> System.out.println(" ROAR :] " +s);
printThing(lambdaprint);

}

static void printThing(Printable p){
    p.print(" !!! ");

}

}

// OUTPUT :  ROAR :]  !!!




// Use a lamba expression in the ArrayList's forEach() method to print every item in the list:

import java.util.ArrayList;

public class Lambda_Expression {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
*/


/* 

//  Use Java's Consumer interface to store a lambda expression in a variable:

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Expression {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
}

*/


// Java Lambda Expression Example: Multiple Parameters

/* 
interface Addable{  
  int add(int a,int b);  
}  

public class Lambda_Expression {  
  public static void main(String[] args) {  
        
      // Lambda expression without return keyword.  
      Addable ad1=(a,b)->(a+b);  
      System.out.println(ad1.add(10,20));  
        
      // Lambda expression with return keyword.    
      Addable ad2=(int a,int b)->{  
                          return (a+b);   
                          };  
      System.out.println(ad2.add(100,200));  
  }  
}  
*/

