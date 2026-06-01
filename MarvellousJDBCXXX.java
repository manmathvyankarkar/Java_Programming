import java.sql.*;
import java.util.*;

class MarvellousJDBCXXX
{
    static Scanner sobj = new Scanner(System.in);

    public static void main(String A[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");
        System.out.println("Connection established successfully");

        System.out.println("Enter Roll No to delete :");
        int RNo = sobj.nextInt();

        String query = "DELETE from student where Rno = ?";

        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, RNo);
        stmt.executeUpdate();

        System.out.println("Data deleted successfully");

        stmt.close();
        con.close();
        sobj.close();

    }
}