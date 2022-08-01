package com.josh.java.training.somemoreconcepts.strings;

import java.util.Scanner;

public class StringsMethods {

	/*
	 * Read a city name from the user, WAJP to generate an integer number by summing
	 * the ascii value of the characters present in the String Example : i/p : DELHI
	 * o/p : 358
	 * 
	 * Design a method to achieve the task method name : stringToInt()
	 * 
	 */
	
	public static int stringToInt( String s )
	{
		int sum  = 0  ; 
		for ( int i = 0 ;  i < s.length() ; i++ )
		{
			sum += s.charAt(i) ;   //using chartAt method
		}
		return sum  ; 
	}

	/*
	 * Password validation  method
	 * 
	 * Password Should Contain
	 *  atleast 1 Upper case
	 *   atleast 1 Digit 
	 *   atleats 1Special character
	 */
	public static boolean validate(String pwd) {
		if (pwd.length() < 8) {
			System.out.println("Length should be atlewast 8");
			return false;
		}

		int uc = 0, dc = 0, sc = 0;
		for (int i = 0; i < pwd.length(); i++) { // length() method is used
			char ch = pwd.charAt(i);
			// check it is uppercase
			if (ch >= 'A' && ch <= 'Z')
				uc++;
			else if (ch >= 'a' && ch <= 'z')
				; // null statement
			else if (ch >= '0' && ch <= '9')
				dc++;
			else {
				if (ch == ' ') {
					System.out.println("Should not contain space");
					return false;
				} else
					sc++;
			}
		} // end of for loop

		if (uc >= 1 && dc >= 1 && sc >= 1)
			return true;

		System.out.println("Password Should Contain ");
		System.out.println("atleast 1 Upper case ");
		System.out.println("atleast 1 Digit ");
		System.out.println("atleats 1 Special character ");
		return false;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter a password : ");
//		String password = s.nextLine().trim(); // trim method is used
//		System.out.println(validate(password) ? "It is Valid " : "It is Invalid ");
		
		System.out.println("Enter the City Name ");
		String city = s.nextLine().trim() ; 
		System.out.println( stringToInt( city ));

	}
}
