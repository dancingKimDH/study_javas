package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents(Statement statement) {
       try {
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
                System.out.println( "총 설명자: " +
                resultSet.getString("CNT"));
            }
       } catch (Exception e) {
        // TODO: handle exception
       }
       
       
        return 0;

    }
    
}
