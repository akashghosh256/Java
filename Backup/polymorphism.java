/* Polymorphism means "many forms", and it occurs when we have many classes that are 
related to each other by inheritance.

Like we specified in the previous chapter; 
Inheritance lets us inherit attributes and methods from another class. 
Polymorphism uses those methods to perform different tasks. 
This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have 
their own implementation of an animal sound (the pig oinks, and the cat meows, etc.): */

class Vehicle{
    public void go(){
        //no body needed to declare 
    }
}

class Car extends Vehicle{
    public void go(){
        System.out.println("The BMW IS MOVING ");
    }
}


class Boat extends Vehicle{
    public void go(){
        System.out.println("LAMBO BOAT is  moving");
    }
}
public class polymorphism {
    public static void main (String args[]){

        Car car = new Car();
        Boat boat = new Boat();

        Vehicle[] racers = {car,boat};

        for(Vehicle x: racers){
            x.go();
        }
    }
}
