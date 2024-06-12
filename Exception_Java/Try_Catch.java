

public class Try_Catch {

    void divide(){
        int a=100, b=0,c;
        c = a/b;
        System.out.println(c);
    }


  public static void main(String[] args) {

    try{
        Try_Catch t = new Try_Catch();
        t.divide();
    }
    catch(Exception e){

System.out.print("Everything Exception Name, description, stacktrace:   ");
        e.printStackTrace();
        System.out.println("Exception Name & description:  "+e);
        System.out.println("Only Description: "+e.getMessage());

    }
    System.out.println("Normal flow still working");
    
  }
    
}
