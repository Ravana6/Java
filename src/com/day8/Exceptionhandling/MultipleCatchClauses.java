package com.day8.Exceptionhandling;

public class MultipleCatchClauses {

	
	public static void main(String args[]) {
		try {

		int array1[]={1};
		int array1Length = array1.length;
		System.out.println("array length = " + array1Length);
		int number = 42 / array1Length;
		int array2[] = { 1 };
		array2[42] = 99;
		
		}
		catch(ArithmeticException e) 
		{
		System.out.println("Divide by 0: " + e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
		System.out.println("Array index out of bound: " + e);
		}
		
		System.out.println("After try/catch blocks.");
		}
}
