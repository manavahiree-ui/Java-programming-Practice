import java.sql.*;

public class CreateJDBC {
    public static void main(String A[]) {
        try {
            System.out.println("step 1");

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("step 2");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            System.out.println("Database Connected...");

            Statement stmt = con.createStatement();

            String query = "INSERT INTO STUDENTS VALUES(4,'Bhakti','Banglore',75)";

            int rows = stmt.executeUpdate(query);

            System.out.println("step 4");

            if (rows > 0) {
                System.out.println("Data Inserted Successfully");
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception Occured:" + e);
        }
    }
}