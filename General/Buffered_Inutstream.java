
import java.io.*;

public class Buffered_Inutstream {
	public static void main(String args[]) throws Exception{

	//InputStreamReader r = new InputStreamReader(System.in);
	//BufferedReader br = new BufferedReader(r);

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter String : ");
String n=br.readLine();
System.out.print("Enter in integer : ");
int ag=Integer.parseInt(br.readLine());
System.out.println("Inputs are > "+n+" yo "+ag);
	
	}
}