import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inser_Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

 String name1 = "Harsh";
 String email1 = "harh@gmail.xxx";
 String pass1= "sexxx";
 String gender1 = "male";
 String city = "Jamshedpur";



            Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded successfully");

       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcakash", "root","");
        System.out.println("Connected Success");

        // Add data to sql table
    //  PreparedStatement ps = con.prepareStatement("insert into register values('AmanKr', 'amanKR@gmail.com', '1234', 'male', '"+city+"')");

        // or another way by positional statement
        PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
        ps.setString(1,name1);
        ps.setString(2,email1);
        ps.setString(3,pass1);
        ps.setString(4,gender1);
        ps.setString(5,city);


// checking success for addditionm
        int i =  ps.executeUpdate();

  if(i>0) System.out.println("Succcess data added");
  else System.out.println("failed data");


    }
}
