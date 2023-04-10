import java.sql.*;
import java.lang.*;

public class gp4 {
    public static void main(String[] args) {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/demo";
                String user = "root";
                String pass = "1012";
                Connection con = DriverManager.getConnection(url, user, pass);
                if(con.isClosed()){
                    System.out.println("Connection failed.....");
                }
                else {
                    System.out.println("Connection created.....");
                }


            //delete
            String delete="delete from table2 where city=?";
                PreparedStatement pstmt= con.prepareStatement(delete);
            pstmt.setString(1,"Bhiwadi");
            pstmt.executeUpdate();


            //read
            String read="select*from table2";
            PreparedStatement pstm= con.prepareStatement(read);
            ResultSet res=pstm.executeQuery();
            while(res.next()){
                System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getInt(3));
            }

            String update="update table2 set district=?,code=? where city=?";
            PreparedStatement pupdate=con.prepareStatement(update);
            pupdate.setString(1,"India");
            pupdate.setInt(2,91);
            pupdate.setString(3,"Haryana");
            pupdate.executeUpdate();
            System.out.println("Data is updated");



            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
