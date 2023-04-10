import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "1012";
        Connection con = DriverManager.getConnection(url, user, pass);

        String q = "update table1 set tName=?, tCity=? where tId=?";

        PreparedStatement pstmt = con.prepareStatement(q);

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Name: ");
        String name = sc.next();

        System.out.println("Enter Name of City: ");
        String city = sc.next();

        System.out.println("Enter ID: ");
        int id=Integer.parseInt(String.valueOf(sc.nextInt()));

        pstmt.setString(1,name);
        pstmt.setString(2,city);
        pstmt.setInt(3,id);

        pstmt.executeUpdate();
        con.rollback();
        System.out.println("Data is updated.....");

        con.close();
    }
}
