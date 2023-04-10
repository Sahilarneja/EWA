import java.sql.*;
import java.util.Scanner;

public class delete_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "1012";
        Connection con = DriverManager.getConnection(url, user, pass);

        String q="delete from table1 where tId=?";
//        Statement stmt= con.createStatement();
//        stmt.executeUpdate(q);
//        System.out.println("DATA IS DELETED...");
//        con.close();

        System.out.println("Enter ID: ");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        PreparedStatement pstmt= con.prepareStatement(q);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        System.out.println("DATA IS DELETED...");
    }
}
