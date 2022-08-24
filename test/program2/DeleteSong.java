package com.java.test.program2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteSong {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song name to delete details");
		String name = sc.nextLine();
		sc.close();
		
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/song", "postgres", "123456");
             Statement statement = conn.createStatement()) {

          int flag=  statement.executeUpdate(deleteByName(name));
           
            System.out.println((flag==1)?name+" details deleted successfully ":name+" not exits"); 

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String deleteByName(String name) {

        return "DELETE FROM palylist WHERE songNAME='" + name + "'";

    }
}