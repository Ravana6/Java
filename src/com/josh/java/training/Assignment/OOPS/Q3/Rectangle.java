package com.josh.java.training.Assignment.OOPS.Q3;

public class Rectangle extends Shape{
// instance variables
	double width;
	double length;
	
	//no-argument  constructor
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	
	//parameterized constructor
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle( double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	//to get area of the rectangle
	public double getArea(){
		return this.width*this.length ;
	}
	
	//to get perimeter of the rectangle
	public double getPerimeter(){
		return 2*(this.length+this.width);
	}

	@Override
	public String toString() {
		return "A Rectangle with width = "+this.width+" and length = "+this.length+" which is a subclass of  "+super.toString();
	}

	
	
	
	
}
