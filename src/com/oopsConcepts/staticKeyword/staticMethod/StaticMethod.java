package com.oopsConcepts.staticKeyword.staticMethod;

public class StaticMethod {
    public static void print()
    {
    	System.out.println("From print()");
    }
    
    public static void main(String[] args) {
		System.out.println("Main Begin");
		print(); //directly
		StaticMethod.print(); //with help of class name
		new StaticMethod().print(); // creating object 
	}
}
