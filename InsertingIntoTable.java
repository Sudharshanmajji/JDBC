import java.sql.*;
public class InsertingIntoTable
{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/jdbc";
        String user="root";
        String password="Your_password";

        Connection con=DriverManager.getConnection(url,user,password);

        Statement st=con.createStatement();

// Creating
        String query="insert into employee values " +
                       "(101,'Durga')," +
                        "(102,'Amit')," +
                         "(105,'Naveen') ";
        st.executeUpdate(query);
  //Updating

  String query1="update employee set name='siddhu' where id=102" ;
  st.executeUpdate(query1);

  //deleting
  String query2="delete from employee where id=102";
  st.executeUpdate(query2);
  con.close();
    }
}
