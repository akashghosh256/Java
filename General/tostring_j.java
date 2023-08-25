class car{
String make="Food";

public String toString(){
return make+" chinese";
}

}

public class tostring_j {
public static void main(String args[]){  
car cars=new car();
System.out.println(cars);  //explicit
System.out.println(cars.toString());    //implicit

}
}
