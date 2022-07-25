package com.JavaProgrammingAssignment;

import  java.util.Scanner;
public class ExtractDigits {
	
	public static void Extract_Digits(int number)
	{ 
		while(number>0)
		{
			//to get last number
			int remainder=number%10;
			System.out.print( " "+remainder);
			
			//to delete last number
			number=number/10;
		}

	}
 public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);

		 System.out.println("Enter the number");
		 try {   //using try catch if we get exception
			 
			 int number=sc.nextInt();
			 Extract_Digits(number);
			 sc.close();

		 }
		 catch(Exception e)
		 {
			 System.out.println("enter the integer value");
		
			 
		 }
	 

	
      
}
}
