import java.io.FileNotFoundException;
import java.io.FileReader;


public class file_reader {
    public static void main(String[] args) {
        
        try{
            FileReader reader = new FileReader("C:/Users/HP/Desktop/secret_msg.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error writing to file");
        }
        catch(Exception e){
            System.out.println("Error reading a file, exception => "+e);
        }
    }
    
}
