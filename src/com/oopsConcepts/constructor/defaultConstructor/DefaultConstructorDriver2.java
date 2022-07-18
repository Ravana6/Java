package com.oopsConcepts.constructor.defaultConstructor;

public class DefaultConstructorDriver2 {
	public static void main(String[] args) 
	{
		System.out.println("Main Begin :" );
		new DefaultConstructorDemo2()  ;   //without declaring the reference 
		System.out.println("========================" );
		new DefaultConstructorDemo2() ; 
		System.out.println("Main End :" );
	}
}
