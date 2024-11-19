import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Input Customer ID : ");
        String cusid=scanner.nextLine();

        System.out.print("Input Customer Title : ");
        String title=scanner.nextLine();

        System.out.print("Input Customer Name : ");
        String name=scanner.nextLine();

        System.out.print("Input Customer DOB : ");
        String dob=scanner.nextLine();

        System.out.print("Input Customer Address : ");
        String address=scanner.nextLine();

        System.out.print("Input Customer City : ");
        String city=scanner.nextLine();

        System.out.print("Input Customer province : ");
        String province=scanner.nextLine();

        System.out.print("Input Customer PostalCode : ");
        String zip=scanner.nextLine();

        System.out.print("Input Customer Salary : ");
        double salary=scanner.nextDouble();

    
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root",
                "mysql1");

        String sql = "INSERT INTO Customer VALUES ('"+cusid+"', '"+title+"', '"+name+"', '"+dob+"','"+salary+"', '"+address+"', '"+city+"', '"+province+"','"+zip+"')";
        Statement statement = connection.createStatement();

        int result = statement.executeUpdate(sql);
        System.out.println(result > 0 ? "Success" : "Fail");

    }
}
