import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_scanner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "1012";
        Connection con = DriverManager.getConnection(url, user, pass);

        String q = "insert into table1(tId,tName, tCity) values (?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(q);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter ID: ");
        int id=sc.nextInt();

        System.out.println("Enter Name: ");
        String name=sc.next();

        System.out.println("Enter Name of City: ");
        String city=sc.next();

        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, city);

        pstmt.executeUpdate();
        System.out.println("DATA IS ADDED SUCESSFULLY.....");

        con.close();
    }
}
