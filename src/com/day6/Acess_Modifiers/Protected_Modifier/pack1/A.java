package com.day6.Acess_Modifiers.Protected_Modifier.pack1;

public class A {
	  
	
	protected int  i  ;  //Protected access 

	public static void main( String[] args ) 
	{
		A obj = new A()  ; 
	
		System.out.println( "value of i in A class= "+obj . i ) ;  // Success 
	}
}
