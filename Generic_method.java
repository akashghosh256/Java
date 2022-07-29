 /*
  
Generics means parameterized types. The idea is to allow type 
(Integer, String, … etc., and user-defined types) to be a parameter to methods, classes,
and interfaces. Using Generics, it is possible to create classes that work with 
different data types. An entity such as class, interface, or method that operates
on a parameterized type is a generic entity.

Why Generics?
The Object is the superclass of all other classes, and Object reference can refer 
to any object. These features lack type safety. Generics add that type of safety feature. 
We will discuss that type of safety feature in later examples.

Generics in Java are similar to templates in C++. 
For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well. 
There are some fundamental differences between the two approaches to generic types. 

Types of Java Generics
Generic Method: Generic Java method takes a parameter and returns some value after 
performing a task. It is exactly like a normal function, however, a generic method has 
type parameters that are cited by actual type. This allows the generic method to be used 
in a more general way. The compiler takes care of the type of safety which enables 
programmers to code easily since they do not have to perform long, individual type 
castings.

Generic Classes: A generic class is implemented exactly like a non-generic class. 
The only difference is that it contains a type parameter section. 
There can be more than one type of parameter, separated by a comma. 
The classes, which accept one or more parameters, ​are known as parameterized classes or 
parameterized types.

Generic Class 
Like C++, we use <> to specify parameter types in generic class creation. 
To create objects of a generic class, we use the following syntax. 

// To create an instance of generic class 
BaseType <Type> obj = new BaseType <Type>()
Note: In Parameter type we can not use primitives like ‘int’,’char’ or ‘double’.




  */


 public class Generic_method {

   public static void main(String args[]) {
	  
      Integer[] intArray = {1, 2, 3, 4, 5};  // Integer[] is an array of Integer
      Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};  // Double[] is an array of Double
      Character[] charArray = {'H', 'E', 'L', 'L', 'O'};   // Character[] is an array of Character
      String[] stringArray = {"B","Y","E"};  // String[] is an array of String
      
      System.out.print("Integer Array: ");  
      displayArray(intArray);   // prints Integer Array: 1 2 3 4 5
      System.out.println(firstIndex(intArray));  // prints 0

      System.out.print("Double Array: ");
      displayArray(doubleArray);   
      System.out.println(firstIndex(doubleArray));  

      System.out.print("Character Array: ");
      displayArray(charArray);
      System.out.println(firstIndex(charArray));
      
      System.out.print("String Array: ");
      displayArray(stringArray);
      System.out.println(firstIndex(charArray));
   
   }

   

   // Generic method , to display array elements
   // People generally use <T> in place of <Thing>  but no issue, its same
public static <Thing> void displayArray(Thing[] array) { 
   // <Thing> is a placeholder for the type of the array, 
   // it will print every data type of array

      for(Thing x : array) { // for each element in the array
         System.out.print(x+" ");
      }
      System.out.println();
   }
  
   // Generic method with generic return type , to print the first element of the array
   // People generally use <T> in place of <Thing>  but no issue, its same
   public static <Thing> Thing firstIndex(Thing[] array) { 

		return array[0];
   }

 }


