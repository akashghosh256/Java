/*
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
*/


class Human{
    String name;
    Human(String name){
        this.name = name;

    }

    void eat(){
        System.out.println("let's eat "+this.name);
    }
}


public class constructor {
    public static void main(String[] args) 
    {
    Human h1=new Human("Akash");
    Human h2=new Human("BoywithYuke");
    h1.eat();
    System.out.println(h2.name);

}}
