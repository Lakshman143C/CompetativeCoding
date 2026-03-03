package org.java.training.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionsDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        transferAmount(connection,1,2,300);
        transferAmount(connection,2,3,200);
    }

    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/learn_impl";
        String username="root";
        String password="password";

        return DriverManager.getConnection(url, username, password);
    }

    public static void transferAmount(Connection connection,int fromAccount,int toAccount,double balance) throws SQLException {
        connection.setAutoCommit(false);
        try {

            //withdraw
            PreparedStatement withdraw = connection.prepareStatement(
                    "UPDATE BankAccount SET balance = balance - ? WHERE account_number = ?");
            withdraw.setDouble(1, balance);
            withdraw.setInt(2, fromAccount);
            withdraw.executeUpdate();

            // deposit
            PreparedStatement deposit = connection.prepareStatement(
                    "UPDATE BankAccount SET balance = balance + ? WHERE account_number = ?");
            deposit.setDouble(1, balance);
            deposit.setInt(2, toAccount);
            int res= deposit.executeUpdate();
            if(res==0){
                throw new SQLException();
            }
            connection.commit(); // COMMIT
            System.out.println("Transaction Successful!");
        }catch (Exception ex){
            connection.rollback(); // ROLLBACK
            System.out.println("Transaction Failed! Rolled Back.");
        }
    }
}
