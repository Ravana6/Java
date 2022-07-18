 	package com.oopsConcepts.constructor.no_argConstructor;

public class Student {
 int age  ; // specif 
	public static void main ( String[] args ) 
	{
		Student s1  ; 
		s1  = new Student ()  ; 
		System.out.println("age : " +   s1.age       ) ; //  0 
		
		// assign age as 24  
		s1 . age  = 24  ;  
		
		System.out.println("age :" + s1.age   ) ; // 24 
		System.out.println( s1 ) ; // 
	}
}
