package com.oopsConcepts.polymorphism.types.runtimePolymorphismORdynamicBinding;

class Vehicle 
{ 
	void move() 
	{
		System.out.println("I Commute using a Vehicle...!!! ") ;
	}
}

class Bike extends Vehicle  
{ 
	@Override
	void move() 
	{
		System.out.println( "I commute using Bike " ) ;
	}
}

class Car extends Vehicle 
{
}

public class MoveVehicle {
	public static void main(String[] args) 
	{
		Vehicle obj1  = new Bike()  ; 
		obj1.move()  ;  // Bike 
		Vehicle obj2 = new Car()  ; 
		obj2.move()  ; //  using vehicle 
	}
}
