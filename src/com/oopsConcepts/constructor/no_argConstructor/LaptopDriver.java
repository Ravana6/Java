package com.oopsConcepts.constructor.no_argConstructor;

public class LaptopDriver {
      
	public static void main(String[] args) 
	{
		 Laptop l1 = new Laptop()  ;  //no arg constructor
		
		 // we have to use object name and variable name to  Initialize or modify
		 
		 
		 l1.ram  = 4  ;   
		 l1.harddisk  = 500  ; 
		 l1.price = 20000 ; 
		 //--------------------------------------------
		 Laptop l2 = new Laptop()  ;  //no arg constructor
		 l2.ram = 8 ;  
		 l2.harddisk = 500  ; 
		 l2.price = 45999 ; 
		 //-------------------------------------------
		Laptop l3 = new Laptop()  ;  //no arg constructor
		l3.ram = 8  ; 
		l3.harddisk = 1024 ; 
		l3.price = 50999 ; 
		
		
		// display data
		
		System.out.println("First Laptop Details : ") ;
		System.out.println("Ram Size : " + l1.ram + "GB" ) ;
		System.out.println("Harddisk : " + l1.harddisk + "GB") ;
		System.out.println("Price : " + l1.price + "Rs." ) ;
		System.out.println("==============================") ;
		System.out.println("Second Laptop Details : ") ;
		System.out.println("Ram Size : " + l2.ram + "GB" ) ;
		System.out.println("Harddisk : " + l2.harddisk + "GB") ;
		System.out.println("Price : " + l2.price + "Rs." ) ;
		System.out.println("==============================") ;
		System.out.println("Third Laptop Details : ") ;
		System.out.println("Ram Size : " + l3.ram + "GB" ) ;
		System.out.println("Harddisk : " + l3.harddisk + "GB") ;
		System.out.println("Price : " + l3.price + "Rs." ) ;
		System.out.println("==============================") ;
	}
}
