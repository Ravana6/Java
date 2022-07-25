package com.day8.Exceptionhandling;

public class TryCatch {
   
	public static void main(String args[]) {
		int number1, number2;
		try { // monitor a block of code.
	        	number1 = 0;
		        number2 = 42 / number1;
		        System.out.println("This will not be printed.");
		}
		catch (ArithmeticException e)  // catch divide-by-zero error
		{
	             	System.out.println("Division by zero not posible");
		}
		System.out.println("After catch statement.");
		}
}
