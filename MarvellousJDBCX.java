import java.sql.*;
import java.util.*;

class MarvellousJDBCX {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        try {
            // 1. Load Driver and Establish Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");
            System.out.println("Connection established successfully");

            // 2. Get User Input FIRST
            System.out.println("Enter Roll No : ");
            int RNo = sobj.nextInt();
            
            System.out.println("Enter Name : ");
            String Name = sobj.next(); 
            
            sobj.nextLine(); // Consume the leftover newline character
            System.out.println("Enter City : ");
            String City = sobj.nextLine();
             
            System.out.println("Enter Marks : ");
            int Marks = sobj.nextInt();

            // 3. Prepare the SQL Query with Placeholders (?)
            String query = "INSERT into Student (RNo, Name, City, Marks) values(?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);

            // 4. Bind the variables to the placeholders
            stmt.setInt(1, RNo);
            stmt.setString(2, Name);
            stmt.setString(3, City);
            stmt.setInt(4, Marks);

            // 5. Execute the update (returns an int, not an object)
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Data Inserted successfully");
            System.out.println("Rows affected: " + rowsAffected);

            // 6. Cleanup
            stmt.close();
            con.close();
            sobj.close();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}