

class Car{
    private String make;
    private String model;

    Car(String make, String model){
        this.setMake(make);
        this.setModel(model);
    }
// using get and set
    public String setMake(String make) {
        return this.make = make;
    }

    public String setModel(String model) {
        return this.model = model;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
      return model;
    }
  
    
// copy function to copy one object to other
public void copy(Car x){
    this.setMake(x.getMake());
    this.setModel(x.getModel());
}
}

public class copy_objects{
    public static  void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");

        car2.copy(car1);  // calling copy function
        System.out.println("Memory address of car1  "+car1); 
        System.out.println("Memory address of car2  "+car2);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
}
}