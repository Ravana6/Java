package com.day6.Final.FinalMethod;


class Fruit 
{
	final void printDetails()  // Overriden 
	{
		System.out.println("Fruit class ..!! ") ;
	}
}

class Mango extends Fruit 
{
	 // overriding  // we cannot inherit the final method or variable 
	
	
//	void printDetails()  
//	{
//		super . printDetails()  ; 
//		System.out.println("From Mango class..!! ") ;
//
//	}
	
	
}
public class Method {
	public static void main(String[] args) 
	{
		Fruit m1 = new Mango() ; 
		m1.printDetails() ; 						
	}
}
