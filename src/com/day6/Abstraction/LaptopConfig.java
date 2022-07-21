package com.day6.Abstraction;

abstract class Laptop 
{
	int rs  ; 

	abstract void displayConfig()  ;
}
public class LaptopConfig extends Laptop{
     
//  override the abstract method of Laptop class 
	@Override
	void displayConfig() 
	{
		 // writ the code....
		System.out.println("Belogs to Laptop, implemented in Demo6 ") ;
	}

	public static void main(String[] args )
	{
		Laptop l1 = new LaptopConfig()  ;  // upcasted 
		l1.displayConfig() ;  // Compile time Successful 
	}
}
