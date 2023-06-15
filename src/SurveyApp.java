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

            Statement statement_second = connection.createStatement();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("QUESTIONS"));
                queryB = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" + //
                        "FROM question_choice AS T_QUES\n" + //
                        "INNER JOIN choice AS T_CHO\n" + //
                        "ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" + //
                        "AND QUESTIONS_ID = 'Q1';";
                ResultSet resultSet_second = statement_second.executeQuery(queryB);
                int number_second = 1;
                while (resultSet_second.next()) {
                    System.out.print(number_second + ". " + 
                    resultSet_second.getString("CHOICE") + ", ");
                    number_second = number_second + 1;
                    
                } System.out.println();
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
