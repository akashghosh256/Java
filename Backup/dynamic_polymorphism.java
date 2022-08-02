/*

Dynamic polymorphism is a process or mechanism in which a call to an overridden method 
is to resolve at runtime rather than compile-time. 
It is also known as runtime polymorphism or dynamic method dispatch. 
We can achieve dynamic polymorphism by using the method overriding.

In this process, an overridden method is called through a reference variable 
of a superclass. The determination of the method to be called is based on the 
object being referred to by the reference variable.

*/


import java.util.*;

class Animal{
    public void speak(){
        System.out.println("Animal goes *brrrrrrrrr* ");
    }
}

class Dog extends Animal{
    @Override

    public void speak(){
        System.out.println("Dogs *BARK* ");
    }
}

class Lion extends Animal{
    public void speak(){
        System.out.println("Lion *ROAR* ");
    }
}

public class dynamic_polymorphism{
    public static void main (String args[]){

        Animal animal;

        Scanner in = new Scanner(System.in); 
        System.out.println("What animal do you want !");
        System.out.print("1 for Dog or 2 for Lion :");
        int choice = in.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Lion();
            animal.speak();
        }
       else {
        animal = new Animal();
        System.out.println("Choice is invalid!");
        animal.speak();
       }


}}