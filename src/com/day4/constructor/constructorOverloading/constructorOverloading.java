package com.day4.constructor.constructorOverloading;

public class constructorOverloading {
 
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1 , "Jony" , 30000.0  )  ;
		e1.displayProperties()  ; 
		System.out.println("===========================") ;
		Employee e2 = new Employee( 2 )  ; 
		e2.displayProperties()  ;
	}
}
