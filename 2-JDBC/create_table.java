import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url= "jdbc:mysql://localhost:3306/demo";
        String user= "root";
        String pass= "1012";
        Connection con= DriverManager.getConnection(url,user,pass);

        String q= "create table table1( tId int, tName varchar (200), tCity varchar (300))";

        Statement stmt= con.createStatement();
        stmt.executeUpdate(q);

        System.out.println("Connection created....");
        con.close();
    }
}
