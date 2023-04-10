import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_table1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "1012";
        Connection con = DriverManager.getConnection(url, user, pass);

        String q= "insert into table1(tId,tName, tCity) values (?,?,?)";

        PreparedStatement pstmt= con.prepareStatement(q);
        pstmt.setInt(1,2);
        pstmt.setString(2,"Hardik");
        pstmt.setString(3,"Rewari");
        pstmt.executeUpdate();
        System.out.println("data inserted.....");
        con.close();
    }
}
