import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "mysql1");
        
        String sql = "INSERT INTO Customer VALUES ('C033', 'Mrs', 'Kamala', '1976-12-15', 100000.00, 'Panadura', 'Panadura', 'Western', '70000')";
        Statement statement = connection.createStatement();

        int result=statement.executeUpdate(sql);
        System.out.println(result > 0? "Success" : "Fail");


    }
}
