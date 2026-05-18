import java.sql.*;

public class jdbcConnection
{
    public static void main(String[] args) throws  Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbc";

        String user="root";
        String password="Your_Password";

        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("Connection Successful");

        con.close();
    }
}
