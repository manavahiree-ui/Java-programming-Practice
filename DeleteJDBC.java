import java.sql.*;

public class DeleteJDBC {
    public static void main(String A[]) {
        try {
            System.out.println("step 1");

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("step 2");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            System.out.println("Data Deleted Successfully...");

            Statement stmt = con.createStatement();

            String query = "DELETE FROM STUDENTS WHERE RNO=1";

            stmt.executeUpdate(query);

            System.out.println("step 4");

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception Occured:" + e);
        }
    }
}
//////////////////////////////////////////////////////////////
//
//command to compile
// javac -cp ".;mysql-connector-j-9.7.0.jar" filename.java
//to run
//java -cp ".;mysql-connector-j-9.7.0.jar" filename
//
///////////////////////////////////////////////////////////////