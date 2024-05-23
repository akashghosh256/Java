
import java.io.IOException;
import java.sql.*;


public class Fetch_Data {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded successfully");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcakash", "root","");
        System.out.println("Connected Success");



        PreparedStatement ps =  con.prepareStatement("select * from register");
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            String name1 = rs.getString("name");
            System.out.println(name1);
            System.out.println(rs.getString("email"));
            System.out.println(rs.getString("password"));
            System.out.println(rs.getString("gender"));
            System.out.println(rs.getString("city"));
            System.out.println("---------------------------------------");
        }

        con.close();












    }

}
