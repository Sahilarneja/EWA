import java.sql.*;
import java.util.*;
import java.lang.*;
public class ebook_shop {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/ebook";
            String user = "root";
            String pass = "1012";
            Connection con = DriverManager.getConnection(url, user, pass);

            //create table
            String q = "create table table1(id int, title varchar(50), author varchar(50), price float, qty int) ";

            // stmt.executeUpdate(q);
            System.out.println("TABLE IS CREATED...");

            Statement stmt=con.createStatement();

            //insert data into table
//            String insert = " insert into table1 values (?,?,?,?,?)";
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter id: ");
//            int id = sc.nextInt();
//            sc.nextLine();
//
//            System.out.println("Enter title: ");
//            String title = sc.nextLine();
//            sc.nextLine();
//
//            System.out.println("Enter author: ");
//            String author = sc.nextLine();
//
//            System.out.println("Enter price: ");
//            float price = sc.nextFloat();
//
//            System.out.println("Enter qty: ");
//            int qty = sc.nextInt();
//
//            PreparedStatement pstmt = con.prepareStatement(insert);
//            pstmt.setInt(1, id);
//            pstmt.setString(2, title);
//            pstmt.setString(3, author);
//            pstmt.setFloat(4, price);
//            pstmt.setInt(5, qty);
//
//            pstmt.executeUpdate();
            System.out.println("DATA IS INSERTED...");
            String read="select*from table1";


            // read table
            ResultSet res=stmt.executeQuery(read);
            while(res.next()){
                System.out.println(res.getInt(1)+" "+ res.getString(2)+" "+ res.getString(3)+" "+ res.getFloat(4)+" "
                +res.getInt(5));
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
