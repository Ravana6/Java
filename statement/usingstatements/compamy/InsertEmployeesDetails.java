package com.josh.java.training.jdbc.statement.usingstatements.compamy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

public class InsertEmployeesDetails {

	private static String detailsOfEmployee(String name, double salary, String email) {
		return " insert into employee (name, salary,email,created_date) " + "VALUES ('" + name + "','" + salary + "','"
				+ email + "','" + LocalDateTime.now() + "')";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String name = sc.nextLine();
		System.out.println("Enter the employee E-mail ");
		String email = sc.nextLine();
		System.out.println("Enter the employee salary");
		double salary = sc.nextDouble();
		sc.close();

		try (Connection connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/company", "postgres",
				"123456");

				Statement statement = connect.createStatement();) {

			statement.executeUpdate(detailsOfEmployee(name, salary, email));
			System.out.println(name+" detail entered successfully ");

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
