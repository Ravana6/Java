package com.day6.Final.FinalClass;

final class Vehicle // extends Object  
{
	static String name="vehicle";
	String vname;
	int cc;
	float mileage;
	float max_speed;

	void move()
	{
		System.out.println(this.vname+"  is moving with a speed "+ this.max_speed);
	}
	Vehicle(String vname,int cc,float mileage,float max_speed)
	{
	//super();
	this.vname=vname;
	this.cc=cc;
	this.mileage=mileage;
	this.max_speed=max_speed;
	
	}
	

}

 // we cannot inherit the final class 

//class TwoWheeler extends Vehicle  
//{
//	String type;
//
//TwoWheeler(String vname,int cc,float mileage,float max_speed,String type)
//	{
//	super(vname,cc,mileage,max_speed);
//	this.type=type;
//	}
//
//
//}
public class FinalClass {
	
	public static void main(String[] args) {
		Vehicle w1=new Vehicle("pulser",220,35,156);
		System.out.println(w1.vname);
		System.out.println(w1.cc);
		System.out.println(w1.mileage);
		System.out.println(w1.max_speed);

		w1.move();
	}
	
}
