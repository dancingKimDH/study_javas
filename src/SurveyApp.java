import java.util.Scanner;
import java.util.HashMap;
import java.sql.*;

public class SurveyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM db_cars.factorys";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                resultSet.getString("COMPANY_ID");
                resultSet.getString("COMPANY");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
