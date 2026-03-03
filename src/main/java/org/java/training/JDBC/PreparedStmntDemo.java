package org.java.training.JDBC;
import java.sql.*;

public class PreparedStmntDemo {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/learn_impl";
        String username="root";
        String password="password";

        Connection connection = DriverManager.getConnection(url, username, password);
        insert(connection,"user1","user@mail.com");
        update(connection,3,"updated@email.com");
        connection.close();
    }

    public static void insert(Connection con,String name,String email) throws SQLException {
        String sql="INSERT INTO users (name, email) VALUES (?, ?)";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.executeUpdate();
        ps.close();
    }

    public static void update(Connection con,int id,String email) throws SQLException {
        String sql = "UPDATE users SET email = ? WHERE id = ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();
    }

    public static void delete(Connection con, int id) throws SQLException {
        String sql="DELETE FROM users WHERE id = ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.executeUpdate();
        ps.close();
    }
}
