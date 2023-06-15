
import java.io.*;
import java.util.*;

public class StringTokenizer_test {
public static void main(String args[]) throws Exception{

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer(in.readLine());  // This line alone takes string input *Remember

//---------------------------------------------example 1-----------------------------------------------------
System.out.println("For example 1\n");
System.out.println("Enter a string : ");
String str=in.readLine(); //read a string from keyboard
//  Take input and the convert it to stringTokenizer object
StringTokenizer st1 = new StringTokenizer(str); // Tokenize the string

int count = st1.countTokens(); // count the number of tokens
System.out.println("Number of tokens in the string : " + count);

//printing the tokens
while(st1.hasMoreTokens()) { 
System.out.println(st1.nextToken());
}

//--------------------------------------------------example 2---------------------------------------------------------------

/*
 StringTokenizer(String str, String delim):  delim (eg: !, $, & etc) is a set of 
 delimiters that are used to tokenize the given string. 
 This will remove the delimiters from the string. 
 Here "!" is the delimiter.

 */
System.out.println("\n Example 2: ");
StringTokenizer st2 = new StringTokenizer("JAVA ! Code ! String", " !"); //tokenize the string

// hasMoreElements()	Returns the same value as hasMoreToken
while(st2.hasMoreElements()) { 
System.out.println(st2.nextElement());
}

//--------------------------------------------------example 3---------------------------------------------------------------
/*
StringTokenizer(String str, String delim, boolean flag): The first two 
parameters have the same meaning wherein The flag serves the following purpose.
3.1: If the flag is false, delimiter characters serve to separate tokens

Example:

Input : if string --> "hello geeks" and Delimiter is " ", then 
Output:  tokens are "hello" and "geeks".
3.2: If the flag is true, delimiter characters are considered to be tokens.

Example:

Input : String --> is "hello geeks"and Delimiter is " ", then 
Output: Tokens --> "hello", " " and "geeks".

*/
System.out.println("\n Example 3: ");
StringTokenizer st3 = new StringTokenizer(
    "JAVA : Code : String", " :", true);

while (st3.hasMoreTokens())
System.out.println(st3.nextToken());



	}
}