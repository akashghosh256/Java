/*What is an array object?
Image result for define array object in java
The array of objects represent storing multiple objects in a single name.
In an array of objects, the data can be accessed randomly by using the 
index number.
Reduce the time and memory by storing the data in a single variable */



class Food{

   String name;
   Food(String name){
       this.name = name;
   }
}


public class Array_objects {
    public static void main(String[] args) 
    {
    Food junk1 = new Food("Pizza");
    Food junk2 = new Food("Burger");
    Food junk3 = new Food("drinks");
    Food[] refrigrator ={junk1, junk2,junk3};
    System.out.println(refrigrator[1].name);
}
}












