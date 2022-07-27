package com.josh.java.training.Assignment.OOPS.Q3;

public class Shape {
 String color;
 boolean filled;
 
 public Shape() {
	
		this.color = "green" ;
		this.filled = true;
	}
public Shape(String color, boolean filled) {
	super();
	this.color = color;
	this.filled = filled;
}
public String COLOR() {
	return color;
}
public void setColor(String color) {
	System.out.println("Shape is filled with "+color);
	this.color = color;
}
public boolean FILLED() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
@Override
public String toString() {
	String str=(filled==true)?"filled":"Not filled";
	return  "A Shape with color of "+ this.color+" and "+str;

}


 
}
