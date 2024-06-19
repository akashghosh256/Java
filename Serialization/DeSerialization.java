 // Deserialization = bytestram to object
 // Java code for serialization and deserialization 
// of a Java object

// serialization = convert object of a class to bytestream
import java.io.*;


class Demo implements java.io.Serializable
{
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b)
	{
		this.a = a;
		this.b = b;
	}

}

class DeSerialization
{
	public static void main(String[] args)
	{ 
		
		
		Demo object1 = null;
        String filename = "D:\\Java dsa\\Java\\Serialization\\TestFile.txt";


		// Deserialization
		try
		{ 
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (Demo)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
