import java.io.*;


class ReadAndWrite{

    void readFile() throws FileNotFoundException{

     FileInputStream in = new FileInputStream("D:\\my download folder\\temp resume\\demo.txt");
     System.out.println("file found");

    }
}



public class ThrowS {
    public static void main(String[] args) {

        ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.readFile();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("bro code");
        
    }
    
}
