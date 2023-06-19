import java.util.HashMap;
import java.util.Scanner;
import commons.Commons;
import java.sql.*;
public class CarsWithDB {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit 에디트창
            Statement statement = connection.createStatement();
            // statement: Statement Class의 object, 
            // Statement Interface: SQL statement that is executed against a database
            // Connection 클래스의 createStatement Function?
            String query = "";
            // 작업 키 입력

            Scanner scanner = new Scanner(System.in);
            String workKey = "P";
            while (!workKey.equals("E")) {
                System.out.println("선택입력 : ");
                workKey = scanner.nextLine();
                if (workKey.equals("O")) {
                    System.out.println("- 차 이름 명단 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, T_CAR_INFOR.CAR_INFOR_ID " +
                            "FROM " +
                            "(factorys AS T_FAC " +
                            "INNER JOIN CAR_INFORS AS T_CAR_INFOR " +
                            "ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)";
                    ResultSet resultSet = statement.executeQuery(query);
                    int number = 1;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2;
                    String query2;
                    HashMap<String, String> carNumberMap = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.print(number + ". " +
                                resultSet.getString("COMPANY") + " - " +
                                resultSet.getString("CAR_NAME") + ": ");
                                String carInforId = resultSet.getString("CAR_INFOR_ID");
                                carNumberMap.put(String.valueOf(number),carInforId);
                        query2 = "SELECT T_OPT_INFO.OPTION_NAME " +
                                "FROM OPTION_INFORS AS T_OPT_INFO " +
                                "INNER JOIN `OPTIONS` AS T_OPTS " +
                                "ON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID " +
                                "AND T_OPTS.CAR_INFOR_ID = '" + resultSet.getString("CAR_INFOR_ID") + "'";
                        resultSet2 = statement2.executeQuery(query2);
                        while (resultSet2.next()) {
                            System.out.print(resultSet2.getString("OPTION_NAME") + ", ");
                        }
                        number = number + 1;

                    } System.out.println();

                    //차량 번호 입력
                    System.out.print("= 차 이름 명단: ");
                    String CarNumber = scanner.nextLine();
                    System.out.println("차명 PK" + carNumberMap.get(CarNumber));
                    
                    System.out.println("- 선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "FROM option_infors;";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>();
                    while(resultSet.next()){
                        System.out.print(number + ", " + 
                        resultSet.getString("OPTION_NAME") + ", ");
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                        number = number + 1;
                    } 
                    System.out.println();
                    System.out.print("추가 옵션 선택: ");
                    String optionNumber = scanner.nextLine();
                    System.out.println(carNumberMap.get(CarNumber) + ", " + carOptionInfor.get(optionNumber));
                    String carPk = carNumberMap.get(CarNumber);
                    String optionPk = carOptionInfor.get(optionNumber);
                    
                    // delete option
                    query = "DELETE FROM `OPTIONS`\n" + //
                            "WHERE CAR_INFOR_ID = '" + carPk + "'\n" + //
                            "AND OPTION_INFOR_ID = '"+ optionPk +"'";
                    int count = statement.executeUpdate(query);
                    
                    // insert option
                    Commons commons = new Commons();
                    String optionId = commons.generateUUID();
                    query = "INSERT INTO `OPTIONS`\n" + //
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)\n" + //
                            "value\n" + //
                            "('"+optionId+"', '"+carPk+"', '"+optionPk+"');";
                    count = statement.executeUpdate(query);
                    System.out.println();
                    
                } else if (workKey.equals("S")) {
                    System.out.println("- 통계 시작 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM\n" + //
                            "(factorys AS T_FAC\n" + //
                            "INNER JOIN CAR_INFORS AS T_CAR_INFOR\n" + //
                            "ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)\n" + //
                            "INNER JOIN options AS T_OPTS\n" + //
                            "ON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID;";
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + ", " +
                                resultSet.getString("CAR_NAME") + ", " +
                                resultSet.getInt("CNT"));
                    }
                } else {
                    System.out.println("--- 작업 키 확인 : 입력한 값 :" + workKey);
                }
            }
            System.out.println("--- 작업 종료 ---");
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
