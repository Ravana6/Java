package com.oopsConcepts.constructor.constructorChaining;

public class Chaining {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1 , "Martin" , 2000.0  )  ;
		e1.displayProperties()  ; 
		System.out.println("===========================") ;
		Employee e2 = new Employee( 2 )  ; 
		e2.displayProperties()  ;
		System.out.println("===========================") ;
		Employee e3= new Employee( 3,"Mani" )  ; 
		e3.displayProperties()  ;
	}
}
