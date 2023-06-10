/*Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and 
it does not have a body.
The body is provided by the subclass (inherited from) */

abstract class Vehicle{
    abstract void go();

    
}
class Car extends Vehicle{
    @Override
void go(){
    System.out.println("Yes we drive");
}

}

public class Abstract_j {
    public static void main(String args[]){  
Car car = new Car();
car.go();
    }
}
