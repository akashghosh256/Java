
class UnderAgeException extends Exception{

    // checked Exception CompileTime Exception

    UnderAgeException(){
        super("You are under age");
    }

    UnderAgeException(String message){
        super(message);
    }
    

}

class AdultException extends RuntimeException{



    AdultException(){
        super("You are Adult");
    }

    AdultException(String message){
        super(message);
    }
    

}

public class Custom_Exception {
    public static void main(String[] args) {
        
        int age =80;
        try{
     //   if(age < 18) throw new UnderAgeException("yo");
        if(age < 18) throw new UnderAgeException();
        if( age > 20) throw new AdultException();

        else System.out.println("Good");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
