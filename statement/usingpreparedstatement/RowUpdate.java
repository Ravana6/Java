package com.josh.java.training.jdbc.statement.usingpreparedstatement;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RowUpdate {

    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/company1", "postgres", "123456");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {

            preparedStatement.setBigDecimal(1, new BigDecimal(999.99));
            preparedStatement.setString(2, "karthik s");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}