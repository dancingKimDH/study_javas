package nec;

import java.sql.*;
import java.util.Scanner;
import java.util.HashMap;

public class user_select {

    public static final String User = null;

    // 참여자
    public int user(Statement statement) {

        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "dong0701";
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM user";
            ResultSet resultSet = statement.executeQuery(query);
            Scanner scanner = new Scanner(System.in);
            HashMap<String, String> hashmap = new HashMap<>();

            int number = 1;
            while (resultSet.next()) {

                System.out.print(number + ". " + resultSet.getString("USER") + " ");
                HashMap<String, String> users = new HashMap<>();
                users.put(String.valueOf(number), resultSet.getString("USER_ID"));
                number = number + 1;

            }
            System.out.println("");
            System.out.println("번호를 입력해 주십시오");
            String userreply = scanner.nextLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        return 0;
    }

    // 질문 & 답
    
}
