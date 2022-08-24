package com.java.test.program2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateLanguage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song name to update  Language");
		String name = sc.nextLine();
		System.out.println("Enter the " + name + " updated  Language");
		String  updateSalary = sc.nextLine();
		sc.close();

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/song", "postgres",
				"123456"); Statement statement = conn.createStatement()) {

			statement.executeUpdate(updateLanguage(name, updateSalary));

			System.out.println(name + "song   Language is updated successfully");

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String updateLanguage(String name, String  Language) {

		return "UPDATE palylist SET songLanguage='" + Language + "' WHERE songNAME='" + name + "'";

	}
}