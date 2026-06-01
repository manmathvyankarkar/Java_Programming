import java.sql.*;

public class StudentJDBC
{
    public static void main(String A[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54X", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

            while(rs.next()){
                System.out.println("Roll_No: "+rs.getInt("Roll_no"));
                System.out.println("Name: "+rs.getString("Name"));
                System.out.println("Address: "+rs.getString("Address"));
                System.out.println("Age: "+rs.getInt("Age"));
                System.out.println("Marks: "+rs.getInt("Marks"));
                System.out.println("----------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}