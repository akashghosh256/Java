import java.util.Scanner;

class AgeException extends Exception{ // extends Exception class
	
	AgeException(String message){  // constructor
		super(message);  
	}  
}



public class Custom_Exceptions {

		public static void main(String args[]){
			
			 Scanner scan = new Scanner(System.in);
			 System.out.print("Enter your age: ");
			 int age = scan.nextInt();
	 	 
		      try{  
		    	  checkAge(age);  // calling checkAge method
		      }
		      catch(Exception e)
		      {
		    	  System.out.println("A problem occured: "+e);
		      }   
		}  
		 
		static void checkAge(int age)throws AgeException{ 
			 
			     if(age<18) {
			    	 throw new AgeException("\n"+"You must be 18+ to sign up");  // throw exception
			     }
			     else {
			    	 System.out.println("You are now signed up!"); 
			     }       
		}  
}