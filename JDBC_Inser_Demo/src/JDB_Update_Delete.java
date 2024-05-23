
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class JDB_Update_Delete {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        String city1 = "pune";
        String email1 = "harh@gmail.xxxy";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded successfully");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcakash", "root","");
        System.out.println("Connected Success");


        // for update-----------------------------------------------------------

//      PreparedStatement ps =  con.prepareStatement("update register set city=? where email=?");
//
//      ps.setString(1,city1);
//      ps.setString(2,email1);
//
//      int i = ps.executeUpdate();
//        if(i>0) System.out.println("Update Succcess ");
//        else System.out.println("Update failed");
//        con.close();


      PreparedStatement ps =  con.prepareStatement("delete from register  where email=?");

      ps.setString(1,email1);

      int i = ps.executeUpdate();
        if(i>0) System.out.println("delete Succcess ");
        else System.out.println("delete failed");
        con.close();












    }

    }
