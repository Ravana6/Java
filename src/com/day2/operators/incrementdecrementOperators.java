package com.day2.operators;

public class incrementdecrementOperators {
    public static void main(String[] args) {
    	int a = 10  ; 
		System.out.println( "frist print then update the value (OR) post Increment "+a ++ ); // 10 
		System.out.println(  a ) ; // 11
		System.out.println("=======================");
		a=10;
		System.out.println("first value will update then print (OR) per increment "+  ++a);//11
		System.out.println(a);//11
		
//		Decrement
		int number = 10  ; 
		System.out.println( "frist print then update the value (OR) post decrement "+number-- ); // 10 
		System.out.println(  number ) ; // 11
		System.out.println("=======================");
		number=10;
		System.out.println("first value will update then print (OR) per decrement "+  --number);//11
		System.out.println(number);//11
		
		
//		note
		System.out.println("Note :\"10++\" will not work");
	}
}
