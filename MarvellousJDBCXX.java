import java.sql.*;
import java.util.*;

class MarvellousJDBCXX
{
    static Scanner sobj = new Scanner(System.in);

    public static void main(String A[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");
        System.out.println("Connection established successfully");

        System.out.println("Enter Roll No to update :");
        int RNo = sobj.nextInt();

        System.out.println("Enter new Marks:");
        int Marks = sobj.nextInt();

        String query = "update Student set Marks = ? where RNo = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, Marks);
        stmt.setInt(2, RNo);
        stmt.executeUpdate();
        System.out.println("Data updated successfully");

        stmt.close();
        con.close();
        sobj.close();
    }
}