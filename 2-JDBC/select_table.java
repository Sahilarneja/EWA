import java.sql.*;

public class select_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "1012";
        Connection con = DriverManager.getConnection(url, user, pass);

        String q= "select * from table1";
        PreparedStatement pstmt=con.prepareStatement(q);

        ResultSet res=pstmt.executeQuery();

        while(res.next()){
            System.out.println(res.getInt(1)+" "+ res.getString(2)+" "+res.getString(3));
        }

    }
}
