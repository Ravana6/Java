package com.josh.java.training.somemoreconcepts.strings;

import java.util.Scanner;

public class StringDriver {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);

		
		System.out.println("Enter a password : ");
		String password = s.nextLine().trim(); // trim method is used
		System.out.println(StringsMethods.validate(password) ? "It is Valid " : "It is Invalid ");
}
}
