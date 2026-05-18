<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CreatingaTable {
    public static void main(String[] args) throws  Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc";

        String user = "root";
        String password = "Your_Password";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        String query = " create table employee(id int,name varchar(10))";

        st.executeUpdate(query);
        System.out.println("Table created Successfully");


        con.close();
    }
}
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CreatingaTable {
    public static void main(String[] args) throws  Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc";

        String user = "root";
        String password = "Your_Password";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        String query = " create table employee(id int,name varchar(10))";

        st.executeUpdate(query);
        System.out.println("Table created Successfully");


        con.close();
    }
}
>>>>>>> 8cfebbcaa99aabe8fbe20f86be7eebd48a1a3267
