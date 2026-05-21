import java.sql.*;
import java.util.*;
public class PreparedStatementReadingData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "Root@123";

        Connection con = DriverManager.getConnection(url, user, password);

        String query = "select * from employee";
        PreparedStatement pst = con.prepareStatement(query);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " +
                            rs.getString(2));
        }
    }
}
