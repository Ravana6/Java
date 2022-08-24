package com.java.test.program2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AddSong {

	private static String detailsOfSong(String songName, String songAuthor, String songLanguage) {
		return " insert into palylist (songname, songAuthor,songLanguage,created_date) " + "VALUES ('" + songName + "','" + songAuthor + "','"
				+ songLanguage + "','" + LocalDateTime.now() + "')";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song name");
		String name = sc.nextLine();
		System.out.println("Enter the song author ");
		String author = sc.nextLine();
		System.out.println("Enter the song Language");
		String  language = sc.nextLine();
		sc.close();

		try (Connection connect = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/song", "postgres",
				"123456");

				Statement statement = connect.createStatement();) {

			statement.executeUpdate(detailsOfSong(name, author,language));
			System.out.println(name+" detail entered successfully ");

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}