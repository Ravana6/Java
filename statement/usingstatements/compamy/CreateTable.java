package com.josh.java.training.jdbc.statement.usingstatements.compamy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
  private static final String SQL_CREATE="CREATE TABLE EMPLOYEE "
  		+ "("
  		+ "ID SERIAL PRIMARY KEY ,"
  		+ "Name VARCHAR(100) NOT NULL,"
  		+ "SALARY NUMERIC(15,2) NOT NULL,"
  		+ "Email varchar(100) not null unique,"
  		+ "CREATED_DATE TIMESTAMP WITH TIME ZONE NOT  NULL  DEFAULT CURRENT_TIMESTAMP"
  		+ ")";
  
  public static void main(String[] args) {
	
	  try(Connection conn =DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/company","postgres","123456");
	
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
