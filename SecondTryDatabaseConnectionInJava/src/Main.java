import java.sql.*;

public class Main {
    public static void main(String[] args) {


        try{

            String url = "jdbc:mysql://localhost:3306/advancejava";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                   url ,"root","45kg");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            // String sql = "insert into student values(3,'hello, 'good')";
            //int i = stmt.executeUpdate(sql);
            //if (i == 1)
                //System.out.println("Student registered.");
            //else
               // System.out.println("Student registration failed.");
            //ResultSet ru =stmt.executeUpdate("INSERT INTO  student(ID,NAME,AGE)" + "VALUES(67,'MERATU',21)");
            //ResultSet r=stmt.executeQuery();
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
           /* while(ru.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            */

        }catch(Exception e){ System.out.println(e);}

        //String SQL = "INSERT INTO  student(ID,NAME,AGE)" + " VALUES(67,'MERATU',21)";







        System.out.println("Database Connection In Java");
    }
}


