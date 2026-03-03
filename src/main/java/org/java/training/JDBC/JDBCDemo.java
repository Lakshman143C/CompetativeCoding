package org.java.training.JDBC;
//step-1 Import Required Package
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        //step-2 Define Database Details
        String url="jdbc:mysql://localhost:3306/learn_impl";
        String username="root";
        String password="password";

        //step-3 Establish the Connection
        Connection connection = DriverManager.getConnection(url, username, password);

        //step-4: create statement
        Statement statement = connection.createStatement();


        //step-5: Execute Selection query
        String sql_query="SELECT * FROM users";
        ResultSet resultSet = statement.executeQuery(sql_query);

        System.out.println("--------------------------");
        System.out.println("| ID | USER_NAME | EMAIL |");
        System.out.println("---------------------------");
        int i=0;

        //step-6 process the result
        while (resultSet.next() && i<4) {
            i++;
            int user_id = resultSet.getInt(1);
            String user_name = resultSet.getString(2);
            String email = resultSet.getString(3);

            System.out.println("| "
                    + user_id + " | "
                    + user_name + " | "
                    + email + " |");
        }

        System.out.println("--------------------------------");

        //step-7 close the connection to prevent memory leaks
        resultSet.close();
        statement.close();
        connection.close();
    }

}
