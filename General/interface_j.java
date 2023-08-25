/*An interface is declared by using the interface keyword. 
It provides total abstraction; means all the methods in an interface are
declared with the empty body, and all the fields are public, static and final by default. A class that
implements an interface must implement all the methods declared in the interface.

An interface in Java is a blueprint of a class. 
It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction
. There can be only abstract methods in the Java interface, not method body.
It is used to achieve abstraction and multiple inheritance in Java
.

In other words, you can say that interfaces can have abstract methods and variables. 
It cannot have a method body.
*/


interface prey{
    void flee();
}

interface predator{
    void hunt();
}

class Fish implements prey,predator{

@Override

public void hunt(){
    System.out.println("Fish is hunting");
}

public void flee(){
    System.out.println("Fish is running from shark");
}

}

public class interface_j {
    public static void main (String args[]){
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
