/*
Why StringBuilder when there is String?

String does not allow appending. Each method you invoke on a String creates a 
new object and returns it. 
This is because String is immutable - it cannot change its internal state.

On the other hand StringBuilder is mutable. When you call append(..) 
it alters the internal char array, rather than creating a new string object.

Thus it is more efficient to have:

StringBuilder sb = new StringBuilder();
for (int i = 0; i < 500; i ++) {
    sb.append(i);
}
rather than str += i, which would create 500 new string objects.

Note that in the example I use a loop. As helios notes in the comments, 
the compiler automatically translates expressions 
like String d = a + b + c to something like

String d = new StringBuilder(a).append(b).append(c).toString();
Note also that there is StringBuffer in addition to StringBuilder. 
The difference is that the former has synchronized methods. 
If you use it as a local variable, use StringBuilder. 
If it happens that it's possible for it to be accessed by multiple threads,
 use StringBuffer (that's rarer)

*/

// Java Code to illustrate StringBuilder

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class stringBuilder {
	public static void main(String[] args) throws Exception
	{
		// Create a StringBuilder object
		// using StringBuilder() constructor
		StringBuilder str = new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1
			= new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1.toString());

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = "
						+ str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3
			= new StringBuilder(str1.toString());

		// print string
		System.out.println("String3 = " + str3.toString());
	}
}
