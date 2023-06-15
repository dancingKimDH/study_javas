import java.sql.*;
import surveys.Statistics;

public class SurveyApp {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            Statement statement = connection.createStatement();
            
            // -- 설문자 가능 명단(가입)
            // 1. 홍길동, 2. 장길산,
            System.out.println("--- 설문자 가능 명단 ---");

            String queryB = "SELECT *\n" + //
                    "FROM respondents;";
            ResultSet resultSet = statement.executeQuery(queryB);
            int number = 1;
            while (resultSet.next()) {
                System.out.print(number + ". " +
                        resultSet.getString("RESPONDENTS"));
                number = number + 1;
            }
            System.out.println();

            // 설문 시작
            // 1. 교수는 ...
            // 문항
            System.out.println("--- 설문 시작 ---");
            queryB = "SELECT *\n" + //
                    "FROM questions;";
            resultSet = statement.executeQuery(queryB);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("QUESTIONS"));
            }
            System.out.println();

            // - query Edit
            // 블럭 밖에서 사용되는 변수 중 안에서 사용될 변수가 있나? Parameter / Data Type
            // 블럭 안에서 산출되는 return 중 밖에서 사용될 변수가 무엇인가? Return

            // 통계 - 총 설문자 표시: statistics.java Method
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
