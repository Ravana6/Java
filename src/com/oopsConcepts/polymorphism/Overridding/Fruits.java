package com.oopsConcepts.polymorphism.Overridding;


class Fruit 
{   
	
	 void print() 
	{
		System.out.println( "From Fruit") ;
	}
}

class Mango extends Fruit 
{ 
 @Override
	 void print()   // overridden method
	{
		System.out.println( "From Mango ")  ; 
	}
}

class Alphanso extends Mango
{   
	@Override
	 void print() // overridden method
	{
		System.out.println( "From Alphanso  ")  ; 
	}
}
public class Fruits {
	public static void main(String[] args ) 
	{
			// case1 
			Mango m1  = new Alphanso()  ; 
			m1.print()  ; // Alphanso 
			/*
				compiler binds with Mango class print method 
		
				Alphanso class print method 
			*/
			//======================================
			// case2 : 
			Fruit f1 = new Alphanso ()  ; 
			f1.print()  ;  // Alphanso 
			
	}

}
