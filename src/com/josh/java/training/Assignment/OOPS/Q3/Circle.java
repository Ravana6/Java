package com.josh.java.training.Assignment.OOPS.Q3;

public class Circle extends Shape{
	double radius=1.0;

	//no-argument  constructor
	public Circle() {
	   this.radius=1.0;
	}
  
	public Circle(double radius) {
		this.radius = radius;
	}

	//parameterized constructor
	public Circle( double radius,String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	 
	//to get area of the circle
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	//to get perimeter of the circle
	public double getPerimeter(){
		return 2* Math.PI*this.radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius = "+this.radius+","+"which is a subclass of "+super.toString();
//		return "Circle [radius=" + radius + "]";
	}
	
	
	

}
