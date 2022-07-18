package com.oopsConcepts.staticKeyword.staticBlock;

public class StaticBlock {
  
	public static void main(String[] args) 
	{
		System.out.println("From main " );
	}
	
	static { 
		// static block / static initializer / SIB 
		System.out.println( "From SIB-1 ") ;
		
//		Note : first SIB will be execute than main
	}
}
