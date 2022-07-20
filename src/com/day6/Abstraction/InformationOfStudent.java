package com.day6.Abstraction;


abstract class Student 
{
	void bunk() 
	{
		System.out.println("Miss attendance") ;
	}

	abstract void attend()   ;  
}

class  UpdatedStudent  extends Student   // implementing class 
{
	// 2,  1 concrete and 1 abstract inherited methods 
	// provide implementation to abstract method by overriding it

	void attend() 
	{
		//  -------
	}
}



public class InformationOfStudent {
	public static void main(String[] args) 
	{
		Student s1 =  null ; 
		s1  = new UpdatedStudent() ;
		s1.bunk()  ; 
	}
}
