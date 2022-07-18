package com.oopsConcepts.constructor.constructorOverloading;

public class Employee {
   
	int eid ; 
	String name ;
	double salary  ; 
	{
		System.out.println("IIB-1 ") ;
	}
	{
		System.out.println("IIB-2 ") ;
	}
	Employee()  {
		System.out.println("Employee() ") ;
	} 
	Employee ( int eid  )	{
		System.out.println("Employee(int ) ") ;
		this. eid = eid  ; 
	}
	 Employee( String name ) 	{
		 System.out.println("Employee(String ) ") ;
		 this.name = name  ; 
	}
	
	Employee( int eid , String name , double salary ) 
	{
		System.out.println("Employee( int , String , double)  ") ;
		this.eid = eid  ; 
		this.salary = salary ;
		this.name = name  ; 
	}

	void displayProperties() 
	{
		System.out.println("Eid : " + eid ) ;
		System.out.println("Name : " + name ) ;
		System.out.println("Salary : " + salary ) ;
		System.out.println("======================") ;
	}

}
