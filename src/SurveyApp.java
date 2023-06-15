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

            // 통계
            System.out.println("--- 통계 ---");
            // 총 설명자: 3명
            Statement statement = connection.createStatement();
            String queryA = "SELECT COUNT(T_STAT.RESPONDENTS_ID) AS CNT\n" + //
                    "FROM\n" + //
                    "(SELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID\n" + //
                    ") AS T_STAT";
            ResultSet resultSet = statement.executeQuery(queryA);
            while (resultSet.next()) {
                System.out.println( "총 설명자: " +
                resultSet.getString("CNT"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}

