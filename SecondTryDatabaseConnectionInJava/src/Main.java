import java.sql.*;

public class Main {
    public static void main(String[] args) {


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/advancejava","root","45kg");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            ResultSet r=stmt.executeQuery();
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}

        String SQL = "INSERT INTO  student(ID,NAME,AGE)" + " VALUES(67,'MERATU',21)";







        System.out.println("Database Connection In Java");
    }
}


