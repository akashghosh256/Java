import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poemypc.txt");  
            //FILE with name poemypc.txt will be created automatically
            
            writer.write("Hello World, I am the future of GOOGLE");
            writer.append("I am in last line");
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
    }
}
