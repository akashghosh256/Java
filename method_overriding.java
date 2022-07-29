
class Animal{
    void speak(){
        System.out.println("The animal speaks");
    }
}

class Dog extends Animal{
@Override
void speak(){
    System.out.println("The dogs bark");
}
}


public class method_overriding {
    public static void main(String args[]){
        Animal animal=new Animal();
        Dog dog=new Dog();
        dog.speak();
        animal.speak();
}
}