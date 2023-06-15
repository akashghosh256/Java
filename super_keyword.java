/*The super keyword refers to superclass (parent) objects. 
It is used to call superclass methods, and to access the 
superclass constructor.
The most common use of the super keyword is to eliminate 
the confusion 
between superclasses and subclasses that have methods 
with the same name */


class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;

    }
public String toString(){
    return this.name + " and "+this.age;
}

}



class Hero extends Person{
String power;

Hero(String name, int age, String power){
    super(name,age);
    this.power=power;
}
public String toString(){
return super.toString() + " YO " + this.power;   
} 
   
}



public class super_keyword {
    public static void main(String args[]){  

        Hero hero1=new Hero("Batman",24,"$$$$");
        Person hero2=new Person("Superman",28);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());



}}
