import java.lang.*;
import java.sql.*;
import java.util.*;

public class CityBrowser {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/CityBrowser";
            String user = "root";
            String pass = "1012";
            Connection con = DriverManager.getConnection(url, user, pass);

            if(con.isClosed()){
                System.out.println("Connection failed!!!!!");
            }
            else {
                System.out.println("Connection created.....");
            }

            con.setAutoCommit(false);
            //create table
            String create="create table table1(cityName varchar(50), district varchar(50), countryCode int)";
            Statement stmt= con.createStatement();
//            stmt.executeUpdate(create);
            System.out.println("Table is created...");

            //insert table
            String insert="insert into table1(cityName,district,countryCode) values (?,?,?)";
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter cityName: ");
            String city=sc.next();
            sc.nextLine();

            System.out.println("Enter district: ");
            String district=sc.next();
            sc.nextLine();

            System.out.println("Enter countryCode: ");
            int code=sc.nextInt();

            PreparedStatement pstmt=con.prepareStatement(insert);
            pstmt.setString(1,city);
            pstmt.setString(2,district);
            pstmt.setInt(3,code);

            pstmt.executeUpdate();
//            con.rollback();
            System.out.println("Data is entered succesfully....");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
