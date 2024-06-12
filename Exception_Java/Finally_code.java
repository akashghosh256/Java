

public class Finally_code {

    public static void main(String[] args) {
        int a=100, b=0, c;

        // try{
        //     c = a/b;
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("I am final man");
        // }
        // System.out.println("Luckily got printed");


        // or--------------------
        try{
            c = a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("I am final man");
        }
        System.out.println("Luckily got printed");

    }
    
}
