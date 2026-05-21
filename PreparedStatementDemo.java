import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "Root@123";

        Connection con = DriverManager.getConnection(url, user, password);

        String query =
                "insert into employee values(?,?)";

        PreparedStatement ps =
                con.prepareStatement(query);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter employee number");
            int eno = sc.nextInt();
            System.out.println("Enter employee name ");
            String ename = sc.next();
            ps.setInt(1, eno);
            ps.setString(2, ename);
            ps.executeUpdate();
            System.out.println("Record inserted successfully");
            System.out.println("Do you want to insert one more record");
            String option = sc.next();
            if (option.equalsIgnoreCase("No"))
            {
                break;
            }
        }
        ps.close();
        con.close();
    }
}
