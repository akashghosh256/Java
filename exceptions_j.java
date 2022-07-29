
import java.util.*;

public class exceptions_j {
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);
// try block
try{
    System.out.println("Enter two numbers to divide ");
    int x = in.nextInt();
    int y = in.nextInt();
    int z = x / y;
    System.out.println("Result = "+z);

}
// catch block
catch(ArithmeticException e){
    System.out.println("Can't divide by zero");
}
catch(Exception e){
    System.out.println("Something went wrong, Exception is => "+e);
}
// It will always execute in any case
finally{
    System.out.println("finally code is complete ");
    in.close();  // scanner closed always a good practice
}
    
}
}