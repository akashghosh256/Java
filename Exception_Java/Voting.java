import java.io.*;

class YoungerAgeException extends RuntimeException{

    YoungerAgeException(String msg){
        super(msg);
    }
}

public class Voting {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int age;
        System.out.println("Enter age : ");
        age = Integer.parseInt(in.readLine());
        try{
            if(age < 18)
            throw new YoungerAgeException("Your age is less than 18 NO vote");
            else  System.out.println("Vote Succesfull");
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("voting process completed");

       
    }
    
}
