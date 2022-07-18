package com.oopsConcepts.constructor.constructorChaining;

public class Employee {
	int eid ; 
	String name ;
	double salary  ; 

	Employee()  {
		System.out.println("Employee() --> default constructor") ;
	} 
	Employee ( int eid  )	{
		this();   // calling default constructor
		System.out.println("Employee(int ) --> 1 arg constructor ") ;
		this. eid = eid  ; 
	}
	 Employee(int eid, String name ) 	{
		 this(eid); // calling 1 arg constructor
		 this.name = name  ; 
		 System.out.println("Employee(String ) --> 2 args constructor  ") ;
	}
	
	Employee( int eid , String name , double salary ) 
	{ 
		this(eid,name);
		this.salary = salary ;
		System.out.println("Employee( int , String , double)  -->3 args parameterized constructor  ") ;

	}

	void displayProperties() 
	{
		System.out.println("Eid : " + eid ) ;
		System.out.println("Name : " + name ) ;
		System.out.println("Salary : " + salary ) ;
		System.out.println("======================") ;
	}
}
