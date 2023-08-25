
class vehicle{
double speed;
void go(){
    System.out.println("lets go "+speed+" km/hr");
}
}

class car extends vehicle{
    int wheels=4;
    int doors =4;
   
}

class bicycle extends vehicle{
    int wheels=2;
    int doors=2;
}

public class inheritance_j {
public static void main(String args[]){  

car cars=new car();
bicycle bike=new bicycle();
cars.speed=240;
cars.go();
System.out.println(bike.doors);
System.out.println(cars.speed);

}}
