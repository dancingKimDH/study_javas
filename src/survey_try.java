import java.util.Scanner;
import java.util.HashMap;
import java.sql.*;
import nec.user_select;

public class survey_try {
    public static void main(String[] args) {
        System.out.println("DB연결 성공\n");
        try {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, String> hashmap = new HashMap<>();
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "dong0701";
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            System.out.println("원하시는 항목을 입력하십시오. \n설문 참여는 P, 통계는 S, 종료는 E.");
            String input = scanner.nextLine();
            HashMap<String, String> users = new HashMap<>();
            HashMap<String, String> Question = new HashMap<>();
            HashMap<String, String> Answer = new HashMap<>();
            HashMap<String, String> Reply = new HashMap<>();

            while (!input.equals("E")) {
                if (input.equals("P")) {
                    int number = 1;
                    String query = "SELECT * FROM user";
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.print(number + ". " + resultSet.getString("USER") + " ");

                        users.put(String.valueOf(number), resultSet.getString("USER_ID"));
                        number = number + 1;
                    }
                    System.out.println("");
                    System.out.println("번호를 입력해 주십시오");
                    String userreply = scanner.nextLine();
                    number = 1;
                    int number_second = 1;
                    int number_third = 1;
                    String query_first = "SELECT *\n" + //
                            "FROM question;";
                    ResultSet resultSet_first = statement.executeQuery(query_first);
                    while (resultSet_first.next()) {
                        System.out.println(resultSet_first.getString("QUESTION"));
                        number = number + 1;
                        Question.put(String.valueOf(number), resultSet_first.getString("QUESTION_ID"));
                        String query_next = "SELECT QUE.QUESTION_ID, QUE.QUESTION, ANS.ANSWER_ID, ANS.ANSWER " +
                                "FROM question AS QUE " +
                                "INNER JOIN answer AS ANS " +
                                "ON ANS.QUESTION_ID = QUE.QUESTION_ID;";
                        Statement statement_next = connection.createStatement();
                        ResultSet resultSet_next = statement_next.executeQuery(query_next);
                        while (resultSet_next.next()) {
                            System.out.print(resultSet_next.getString("ANSWER") + " ");
                            Answer.put(String.valueOf(number_second), resultSet_next.getString("ANSWER_ID"));
                            number_second = number_second + 1;
                        }
                        // 답변
                        System.out.println("답변 입력: ");
                        String reply = scanner.nextLine();
                        Reply.put(String.valueOf(number_third), String.valueOf(reply));
                        String query_last = "INSERT INTO statistics(ANSWER_ID, QUESTION_ID, USER_ID)\n" +
                                "VALUES ('" + Answer.get(reply) + "', '"
                                + resultSet_first.getString("QUESTION_ID") +
                                "', '" + users.get(userreply) + "');";
                        Statement statement_last = connection.createStatement();
                        int result = statement_last.executeUpdate(query_last);

                    }
                } else if (input.equals("S")) {
                    String query = "SELECT COUNT(FIRST.USER_ID)\n" + //
                            "FROM (SELECT STA.USER_ID\n" + //
                            "FROM user AS T_USER\n" + //
                            "INNER JOIN statistics AS STA\n" + //
                            "ON T_USER.USER_ID = STA.USER_ID\n" + //
                            "GROUP BY USER_ID) AS FIRST;\n" + //
                            "\n" + //
                            "";
                    ResultSet resultset = statement.executeQuery(query);
                    if (resultset.next()) {
                        int result = resultset.getInt(1);
                        System.out.println("총 설문자 수: " + result);
                        int a = 1;
                        while(a < 5){
                            String max = "QUESTION_0" + a;
                            String query_second = "SELECT MAX(FIRST.ANS)\n" + //
                                    "FROM\n" + //
                                    "(SELECT COUNT(ANSWER_ID) AS ANS\n" + //
                                    "FROM statistics\n" + //
                                    "WHERE QUESTION_ID = '"+ max +"'\n" + //
                                    "GROUP BY ANSWER_ID\n" + //
                                    ") AS FIRST;";
                            ResultSet resultSet = statement.executeQuery(query_second);
                            System.out.println(+ resultSet.getString("MAX(FIRST.ANS)"));
                            a = a + 1;
                        }
                        }
                    } else {
                        System.out.println("통계 결과를 찾을 수 없습니다");
                        break;
                    }
                } else {
                    System.out.println("정확한 키를 눌러주세요");
                    break;
                }

            }
            if (input.equals("E")) {
                System.out.println("설문을 종료하고 데이터를 초기화합니다.");
                String query = "DELETE FROM statistics;";
                int delete = statement.executeUpdate(query);

            }

            statement.close();
            connection.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
