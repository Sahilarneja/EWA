import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url= "jdbc:mysql://localhost:3306/ebook";
        String user= "root";
        String pass= "1012";
        Connection con= DriverManager.getConnection(url,user,pass);

        if(con.isClosed()){
            System.out.println("Connection failed!!!!");
        }
        else{
            System.out.println("Connection created...");
        }
        con.close();
    }
}