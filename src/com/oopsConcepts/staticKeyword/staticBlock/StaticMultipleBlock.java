package com.oopsConcepts.staticKeyword.staticBlock;

public class StaticMultipleBlock {
  
	static { 
		// static block / static initializer / SIB 
		System.out.println( "From SIB-2 ") ;
	}

	public static void main(String[] args) 
	{
		System.out.println("From main " );
	}
	
	static { 
		// static block / static initializer / SIB 
		System.out.println( "From SIB-1 ") ;
	}
	  
	
//	 Note : it will execute in order from top
}
