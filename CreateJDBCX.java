import java.sql.*;

public class CreateJDBCX {
    public static void main(String A[]) {
        try {
            System.out.println("step 1");

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("step 2");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            System.out.println("Database Connected...");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO STUDENTS VALUES(5,'Manav','Pune',96)");

            stmt.executeUpdate("INSERT INTO STUDENTS VALUES(6,'Pari','Mumbai',89)");

            stmt.executeUpdate("INSERT INTO STUDENTS VALUES(7,'Krishna','Delhi',80)");

            System.out.println("step 4");

            System.out.println("Multiple Records Inserted Successfully");

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception Occured:" + e);
        }
    }
}
