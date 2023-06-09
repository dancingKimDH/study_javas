import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {

            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
