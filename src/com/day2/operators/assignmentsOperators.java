package com.day2.operators;

public class assignmentsOperators {
	public static void main(String[] args) 
	{
		int number  ; 
		number = 10  ; 
		System.out.println("number = "+number ) ; // 10 
		
		number = 20  ; 
		System.out.println("number ="+ number) ; // 20 
		
		number += 20 ;
		System.out.println("number = " + number);//40
		
		number *= -30 ;
		System.out.println("number = " + number);//-1200
		
//		without intialization
		
//		int number2;
//		number2+=10;
//		System.out.println("number2 = "+number2);
		
		number %= 4 * 3 + number  ;
		System.out.println("number = " + number);
		System.out.println(-1200%(12-1200));
		
		int a=3;
		a%=4*3+a;
		System.out.println(a);
		System.out.println(3%(4*3+3));
		System.out.println(3%15);
	}

}
