import java.io.*;
import java.util.*;
class A {

	public static void main (String[] args) throws IOException{
       // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        
        System.out.println(c);
		int a = 10;
		int b = 20;

		System.out.println("Before swapping, a = " + a + " and b = " + b);

		// Swapping a and b using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping, a = " + a + " and b = " + b);
	}
}
