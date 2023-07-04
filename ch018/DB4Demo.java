package ch018;

import java.sql.*;

public class DB4Demo {
    public static Connection makeConnection() {
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
//                "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";
        Connection con = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("oracle.jdbc.OracleDriver");

            System.out.println("데이터베이스 연결 중...");
            con = DriverManager.getConnection(url, "system", "1234");
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");

        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
        }
        return con;

    }



    public static void main(String[] args) throws SQLException {
        Connection connection = makeConnection();

        String sql = "SELECT * FROM person";
        PreparedStatement pstmt = connection.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.println("name : " + rs.getString(1) + "\t");
            System.out.println("phone : " + rs.getString("phone"));



    }
}




}
