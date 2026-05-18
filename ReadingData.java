<<<<<<< HEAD
import java.sql.*;
public class ReadingData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbc";
        String user="root";
        String password="Your_Password";

        Connection con=DriverManager.getConnection(url,user,password);

        Statement st=con.createStatement();

       String query="select * from employee";

       ResultSet rs=st.executeQuery(query);
       while(rs.next())
       {
           System.out.println(rs.getInt(1) + " " + rs.getString(2));
       }
        con.close();

    }
}
=======
import java.sql.*;
public class ReadingData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbc";
        String user="root";
        String password="Your_Password";

        Connection con=DriverManager.getConnection(url,user,password);

        Statement st=con.createStatement();

       String query="select * from employee";

       ResultSet rs=st.executeQuery(query);
       while(rs.next())
       {
           System.out.println(rs.getInt(1) + " " + rs.getString(2));
       }
        con.close();

    }
}
>>>>>>> 8cfebbcaa99aabe8fbe20f86be7eebd48a1a3267
