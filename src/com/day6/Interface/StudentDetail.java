package com.day6.Interface;

interface Student            // Service Specifier 
{
	void bunk()  ;    // overridden method 
}

// to create a sub class for Student 

// solution 2

class Students implements Student      //   Service Provider 
{
	// override abstract methods of Student interface 
	public void bunk()  
	{
		System.out.println("Implemented ") ;
	}

	// creating a method to create a Student Object 
	static Student  createStudent() 
	{
		return new Students() ;   // Students Child 
	}
	
}


public class StudentDetail {
	public static void main(String[] args) 
	{
		Student s  =   Students.createStudent() ; 
		s.bunk()  ; 
	}
}
