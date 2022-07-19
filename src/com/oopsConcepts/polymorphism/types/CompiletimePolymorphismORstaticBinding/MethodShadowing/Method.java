package com.oopsConcepts.polymorphism.types.CompiletimePolymorphismORstaticBinding.MethodShadowing;

class Fruit
{
	static void getClassName() 
	{
		System.out.println("Fruit")  ;
	}
}

class Mango extends Fruit  
{
	static void getClassName( ) 
	{
		System.out.println("Mango ") ;
	}
}
class Apple extends Fruit 
{

}

public class Method {
	public static void main(String[] args) 
	{
		Mango.getClassName() ;  // Mango 
		//===========================
		Mango m1  = new Mango()  ; 
		Fruit f1  = m1  ; 
		System.out.println( f1  == m1 ) ; // true 
		m1.getClassName()  ;  //  Mango 
		f1.getClassName()  ; //  fruit 
	}
}
