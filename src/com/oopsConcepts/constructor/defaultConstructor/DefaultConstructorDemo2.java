package com.oopsConcepts.constructor.defaultConstructor;

public class DefaultConstructorDemo2 {
	int i  ; 
	{
		System.out.println("From IIB-1 ") ;
		System.out.println( "i = "+i ) ; // 0 
	}
	{
		System.out.println("From IIB-2 ") ;
		System.out.println( "i ="+i  ) ; // 0 
		i = 10  ; 
	}
	{
		System.out.println("From IIB-3 ") ;
		System.out.println( "i ="+i  ) ; // 10 
	
	}

}
