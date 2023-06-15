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

        } catch (Exception e) {
            System.out.println(e.getMessage());
       
        }
    }
}

