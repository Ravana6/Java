package com.josh.java.training.jdbc.statement.usingstatements.compamy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RowUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name to update salary");
		String name = sc.nextLine();
		System.out.println("Enter the " + name + " updated salary");
		double updateSalary = sc.nextDouble();
		sc.close();

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/company", "postgres",
				"123456"); Statement statement = conn.createStatement()) {

			statement.executeUpdate(updateSalaryByName(name, updateSalary));

			System.out.println(name + " salary is updated successfully");

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String updateSalaryByName(String name, double salary) {

		return "UPDATE EMPLOYEE SET SALARY='" + salary + "' WHERE NAME='" + name + "'";

	}
}