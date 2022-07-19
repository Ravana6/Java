package com.oopsConcepts.staticKeyword.staticVariable;

public class StaticVariable {
   
	static int i  ; // class variable OR Global variable

	public static void main(String[] args) 
	{
		i = 10  ; 
		System.out.println("Main Begin ");
		System.out.println( "i :" + i ) ;
		System.out.println("Main End  ");
	}
	static 
	{
		System.out.println("From SIB-1 ") ;
		System.out.println("i :" + i ) ;
	}
}
