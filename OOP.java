/*Object-oriented programming (OOP) is a style of programming characterized by 
the identification of classes of objects closely linked with the methods (functions)
with which they are associated. 
It also includes ideas of inheritance of attributes and methods. */


class Car{
    String model="Corvette";
    void drive(){
        System.out.println("lets go for a drive");
    }
}


public class OOP {
    public static void main(String[] args) 
    {
        Car mycar=new Car();
        mycar.drive();
        System.out.println(mycar.model);

}
}