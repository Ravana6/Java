package com.oopsConcepts.staticKeyword.staticVariable;

public class StaticVariableWithExpression {
     
	static int i  = laila ( ) ;  // it is an expression  
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		System.out.println("i :" +  i );
		System.out.println("Main end ");
	}
	static int laila() 
	{
		System.out.println("Laila begin..!!") ;
		System.out.println("i : " + i ) ;
		System.out.println("Laila end..!!") ;
		return  10  ; 
	}
	 
}
