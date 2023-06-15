import java.sql.*;

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
            System.out.println("--- 통계 ---");

            
            // -- 총 설문자 : 3명
            String queryB = "SELECT COUNT(*) CNT\n" + //
                    "FROM (\n" + //
                    "SELECT RESPONDENTS_ID, COUNT(*) CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID\n" + //
                    ") AS T_STATIC\n";
            ResultSet resultSet = statement.executeQuery(queryB);
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
