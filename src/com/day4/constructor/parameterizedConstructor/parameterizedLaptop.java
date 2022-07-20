package com.day4.constructor.parameterizedConstructor;

public class parameterizedLaptop {

	int ram  ; 
	int hardisk ; 
	double price  ;
	
	parameterizedLaptop(int ram , int hardisk , double price )
	{
		// Load instr 
		// PWI 
		this.ram = ram  ; 
		this.hardisk = hardisk ; 
		this.price = price  ; 
	}
	
	public static void main(String[] args) 
	{
		// store details of 1 laptop object 4, 500 
		parameterizedLaptop l1 = new parameterizedLaptop( 8 , 1024 , 15000 )  ; 
		System.out.println("Ram Size : " +  l1.ram  ) ;
		System.out.println("HardDisk : " +  l1.hardisk  ) ;
		System.out.println("Price : " +  l1.price   ) ;
		//====================================
		
		System.out.println("============================") ;
		parameterizedLaptop l2 = new parameterizedLaptop(6,1024,25000) ;
		System.out.println("Ram Size : " +  l2.ram  ) ;// 6
		System.out.println("HardDisk : " +  l2.hardisk  ) ;//1024 
		System.out.println("Price : " +  l2.price   ) ;// 25000 
		//========================================

		System.out.println("============================") ;
		parameterizedLaptop l3 = new parameterizedLaptop( 4,1024,30000 )  ; 
		System.out.println("Ram Size : " +  l3.ram  ) ;// 4 
		System.out.println("HardDisk : " +  l3.hardisk  ) ;// 1024 
		System.out.println("Price : " +  l3.price   ) ;// 30000
	}
}
