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
            
            //- query Edit
            Statement statement = connection.createStatement();
      
            // 통계 - 총 설문자 표시       
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);

            // -- 총 설문자 : 3명
            String queryB = "SELECT COUNT(*) CNT\n" + //
                    "FROM (\n" + //
                    "SELECT RESPONDENTS_ID, COUNT(*) CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID\n" + //
                    ") AS T_STATIC\n";
            ResultSet resultSet = statement.executeQuery(queryB);
            while (resultSet.next()) {
                System.out.println( "총 설명자: " +
                resultSet.getString("CNT"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
       
        }
    }
}

