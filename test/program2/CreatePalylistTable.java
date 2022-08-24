package com.java.test.program2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePalylistTable {
  private static final String SQL_CREATE="CREATE TABLE palylist "
  		+ "("
  		+ "songnumber serial  ,"
  		+ "songname varchar(100)  PRIMARY KEY ,"
  		+ "Songauthor VARCHAR(100) NOT NULL,"
  		+ "songlanguage varchar(100)NOT NULL,"
  		+ "CREATED_DATE TIMESTAMP WITH TIME ZONE NOT  NULL  DEFAULT CURRENT_TIMESTAMP"
  		+ ")";
  
  public static void main(String[] args) {
	
	  try(Connection conn =DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/song","postgres","123456");
	
			  Statement statement =conn.createStatement()
			  )
	  {
		  statement.execute(SQL_CREATE);
	  }
	 catch (SQLException e) {
		 System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
}
}