import java.util.*;
public class Strings_Function { 
static String ans="";

    // small string comaprer

    private static String min(String a, String b){
        return a.compareTo(b) < 0 ? a:b;
    }








public static void main(String[] args){
    ans = min("ass", "sex");
    System.out.println(ans);

String s = "   He ll o AAAAA   A      ";


char num = '2';
int  number = num - '0';   // converts character to integer
System.out.println(number);
System.out.println('A' - '0');

String numberAsString = "2222";
number = Integer.parseInt(numberAsString);

System.out.println("The integer value is: " + number);




int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;


s = s.trim();  // removes spaces from front and last 
System.out.println(s);
s = s.replaceAll("\\s+", "");  // removes all spaces
System.out.println(s);
s = s.replaceAll("A", "Z");  // replaces  A to Z
System.out.println(s);


 char[] a = s.toCharArray();  //break string into char array

 // convert String to words array 
 String[] words = s.split("\\s+");  //where \\s is a single space in unicode

 //StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("Apple");
 String temp =  sb.toString();
 
 
 if(s.charAt(0) == s.charAt(2))     
 s.substring(0, 2);

char ch = '8';
if (Character.isDigit(ch)) {
    System.out.println(ch + " is a digit character.");
}
 else if (Character.isLetter(ch)) {
    System.out.println(ch + " is not a digit character.");
}
      
   // Checking whether is white space or not
if (Character.isWhitespace(ch)) {
    System.out.println("Yes WhiteSpace");
}    


String str1 = "Akash" , str2 = "akash";

 str1.equals(str2);
 str2.equalsIgnoreCase(str1);
 str1.compareTo(str2);
//  Working:
// It compares and returns the following values as follows:

// if (string1 > string2) it returns a positive value.
// if both the strings are equal lexicographically
// i.e.(string1 == string2) it returns 0.
// if (string1 < string2) it returns a negative value.






// Why not to use == for comparison of Strings ?

// In general both equals() and == operator in Java are used to compare objects to check equality 
// but here are some of the differences between the two:

// Main difference between .equals() method and == operator is that one is 
// method and other is operator.
// One can use == operators for reference comparison (address comparison) and .equals() 
// method for content comparison.
// In simple words, == checks if both objects point to the same memory location whereas .equals() 
// evaluates to the comparison of values in the objects.

//Example:


// Java program to understand
// why to avoid == operator

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
  
        System.out.println(s1 == s2);
  
        System.out.println(s1.equals(s2));
    
// Output:
// false
// true

















}

}














  