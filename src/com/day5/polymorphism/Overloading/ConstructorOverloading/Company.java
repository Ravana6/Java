package com.day5.polymorphism.Overloading.ConstructorOverloading;


class Employee 
{
	int eid ; 
	String name ;
	double salary  ; 

	Employee()  {
		System.out.println("Employee() ") ;
	} 
	Employee ( int eid  )	 //Constructor Overloading
	{
		System.out.println("Employee(int ) ") ;
		this. eid = eid  ; 
	}
	 Employee( String name )  //ConstructorOverloading
	 {
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
public class Company {
     
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1 , "Martin" , 2000.0  )  ;
		e1.displayProperties()  ; 
		System.out.println("===========================") ;
		Employee e2 = new Employee( 2 )  ; 
		e2.displayProperties()  ;
	}

}
