package com.josh.java.training.jdbc.statement.usingstatements.compamy;

import java.sql.*;

public class RowSelect {
	public static void main(String[] args) {
	
		String sql = "SELECT * FROM EMPLOYEE";

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/company", "postgres",
				"123456"); Statement statement = conn.createStatement()) {

			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {

				long id = resultSet.getLong("ID");
				String name = resultSet.getString("NAME");
				double salary = resultSet.getDouble("SALARY");
				String email = resultSet.getString("email");
				Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");

				Employee obj = new Employee();
				obj.setId(id);
				obj.setName(name);
				obj.setSalary(salary);
				obj.setEmail(email); // Timestamp -> LocalDateTime
				obj.setCreatedDate(createdDate.toLocalDateTime());

	
				System.out.println(obj);
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}