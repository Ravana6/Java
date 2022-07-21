package com.day6.Encapsulation;

public class Employee {
      
	private double salary  ;  // 
	// to modify salary i shd create a setter method
	Employee( ) {} 

	Employee( double salary ) 
	{
		if (salary > 0 )
		{
			this.salary = salary ; 
		}
	}

	void  setSalary( double salary ) 
	{
		if ( salary > 0 )  // validation 
		{
			this.salary = salary  ; 
		}
		else
			System.out.println("Loo idiot..!! salary cannot be 0 or -ve ") ;
	}
	// to read the data i shd create getter method \
	double getSalary() 
	{
		return salary  ; 
	}
}
