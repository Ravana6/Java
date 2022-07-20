package com.day2.operators;

public class logicalOperators {
	public static void main(String[] args) 
	{
//		Logical AND
		
		char ch1 = 'a' ;
		char ch2 = 'c' ; 
		boolean b1 =  ch1 < ch2  ; 
		boolean b2 = ch2  >		 ch1  ; 
		boolean b3 =  b1 && b2 && ch2++ < ch1 && ++ch1 < ch2 ;
		
		System.out.println(b1 );
		System.out.println(b2 );
		System.out.println("b3 using Logical AND = "+b3);
		System.out.println("ch1= "+ch1 );
		System.out.println("ch2 = "+ch2 );
		
//		Logical OR
		boolean b4= b1 || b2 || ch2++ < ch1 || ++ch1 < ch2 ;
		System.out.println("b4 using Logical OR "+b4);
		System.out.println("ch1= "+ch1 );
		System.out.println("ch2 = "+ch2 );
		
		
//		Logical NOT
		
		boolean b5=true;
		boolean b6=!b5;
		System.out.println("b5 = "+b5);
		System.out.println("b6 will be  opposite of b5 = "+b6);
		
	}
}
