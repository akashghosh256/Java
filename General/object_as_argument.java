  // pass object as argument

class Car{
    String name;
    Car(String name){
        this.name=name;
    }
}

class Garage{
    void park(Car car){
        System.out.println(car.name+" PARKED :)"); 
    }
}



public class object_as_argument {
    public static void main(String args[]){
    Garage garage=new Garage();
    Car car1=new Car("AUDI");
    Car car2=new Car("BMW");
    garage.park(car1);
    garage.park(car2);
    
}}
